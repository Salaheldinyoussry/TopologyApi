package models;

import org.codehaus.jackson.annotate.JsonSubTypes;

@JsonSubTypes({
        @JsonSubTypes.Type(value=Resistor.class, name = "Resistor"),
        @JsonSubTypes.Type(value=Nmos.class, name = "Nmos")
})
public abstract  class Component {
private String type;
private String id;
public abstract boolean connectedToNode(String id);

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
