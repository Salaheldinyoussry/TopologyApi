package models;

public class Nmos extends Component{
    private RangeValue m1;
    private NmosNetList netlist;

    public RangeValue getM1() {
        return m1;
    }

    public void setM1(RangeValue m1) {
        this.m1 = m1;
    }

    public NmosNetList getNetlist() {
        return netlist;
    }

    public void setNetlist(NmosNetList netlist) {
        this.netlist = netlist;
    }

    @Override
    public boolean connectedToNode(String id) {
        if(netlist.getDrain().equalsIgnoreCase(id) || netlist.getGate().equalsIgnoreCase(id) || netlist.getSource().equalsIgnoreCase(id) )
            return true;
        return false;
    }
}
