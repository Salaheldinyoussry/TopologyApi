package repositeries;

import models.Topology;

import java.util.List;

public class TopologyRepo {
List <Topology> l;

    public TopologyRepo(List<Topology> l) {
        this.l = l;
    }

    public List<Topology> getListTopologies() {
        return l;
    }

    public void setListTopologies(List<Topology> l) {
        this.l = l;
    }
    public void addTopolgy(Topology t){
        this.l.add(t);
    }
    public void deleteTopolgy(String id){
        for(int i=0; i<l.size(); i++){
            if(l.get(i).getId().equalsIgnoreCase(id)){
                l.remove(i);
                break;
            }
        }
    }


    public Topology getTopolgyById(String id){
        for(int i=0; i<l.size(); i++){
            if(l.get(i).getId().equalsIgnoreCase(id)){
                return l.get(i);
            }
        }
    return null;
    }

}
