package service;

import models.Component;
import models.Topology;

import java.util.List;

public interface ToplogyService {

    void readJSON(String fileName);
    void writeJSON(String id);
    List<Topology> queryTopologies();
     void deleteTopolgy(String id);
    List<Component>  queryDevices(String fileName);
    List<Component>  queryDevicesWithNetlistNode(String id, String netListId);

}
