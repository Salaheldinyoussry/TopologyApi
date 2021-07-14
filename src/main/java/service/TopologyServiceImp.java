package service;

import models.Component;
import models.Topology;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import repositeries.TopologyRepo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TopologyServiceImp implements ToplogyService{
TopologyRepo tr;

    public TopologyServiceImp(TopologyRepo tr) {
        this.tr = tr;
    }

    @Override
    public void readJSON(String fileName) {
        Topology t = null;
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            t =  mapper.readValue(new File(fileName), Topology.class);
        } catch (JsonGenerationException e)
        {
            e.printStackTrace();
        } catch (JsonMappingException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void writeJSON(String id) {


        @SuppressWarnings("deprecation")
        Topology t=tr.getTopolgyById(id);
        ObjectMapper mapper = new ObjectMapper();
        try
        {
            mapper.writeValue(new File("topology.json"), t);
        } catch (JsonGenerationException e)
        {
            e.printStackTrace();
        } catch (JsonMappingException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public List<Topology> queryTopologies() {
        return tr.getListTopologies();
    }

    @Override
    public void deleteTopolgy(String id) {
        tr.deleteTopolgy(id);
    }

    @Override
    public List<Component> queryDevices(String id) {
     return tr.getTopolgyById(id).getComponents();
    }

    @Override
    public List<Component>  queryDevicesWithNetlistNode(String id, String netListId) {
         List<Component> lc =tr.getTopolgyById(id).getComponents();
         List <Component> ans=new ArrayList<>();
         for(int i=0; i<lc.size(); i++){
             if(lc.get(i).connectedToNode(netListId)){
                 ans.add(lc.get(i));
             }
         }

        return ans;
    }
}
