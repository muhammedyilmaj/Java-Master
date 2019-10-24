package models;

public class PickerTypeSpecification {
    private String id;
    private String name;
    private String active_since;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getActiveSince() {
        return active_since;
    }

    public void setActiveSince(final String activeSince) {
        this.active_since = activeSince;
    }
    @Override
    public String toString(){
        return getId() +", "+ getName();
    }
}
