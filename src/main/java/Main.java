import models.Topology;

import java.io.File;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Main {
public static void main(String args[]){

    @SuppressWarnings("deprecation")
    Topology t=new Topology();
    ObjectMapper mapper = new ObjectMapper();
    try
    {
        mapper.writeValue(new File("employee.json"), t);
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

}
