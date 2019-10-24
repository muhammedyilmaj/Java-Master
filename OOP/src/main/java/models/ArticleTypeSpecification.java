package models;

public class ArticleTypeSpecification {
    private String id;
    private String name;
    private String temperatureZone;

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

    public String getTemperatureZone() {
        return temperatureZone;
    }

    public void setTemperatureZone(final String temperatureZone) {
        this.temperatureZone = temperatureZone;
    }

    @Override
    public String toString() {
        return "ArticleTypeSpecification{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", temperatureZone='" + temperatureZone + '\'' +
            '}';
    }
}
