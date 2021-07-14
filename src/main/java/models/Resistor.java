package models;

public class Resistor extends Component{
private RangeValue resistance;
private ResistanceNetlist netlist;

    public RangeValue getResistance() {
        return resistance;
    }

    public void setResistance(RangeValue resistance) {
        this.resistance = resistance;
    }

    public ResistanceNetlist getNetlist() {
        return netlist;
    }

    public void setNetlist(ResistanceNetlist netlist) {
        this.netlist = netlist;
    }

    @Override
    public boolean connectedToNode(String id) {
        if(netlist.getT1().equalsIgnoreCase(id) || netlist.getT2().equalsIgnoreCase(id))
            return true;
        return false;
    }
}
