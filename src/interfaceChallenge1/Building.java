package interfaceChallenge1;

public class Building implements Mappable{

    private String name;
    private UsageType usage;
    private String iconType;
    private Geometry geometryType;

    public Building(String name, UsageType usage, String iconType, Geometry geometryType) {
        this.name = name;
        this.usage = usage;
        this.iconType = iconType;
        this.geometryType = geometryType;
    }

    public String getName() {
        return name;
    }

    public UsageType getUsage() {
        return usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getGeometryType() {
        return geometryType;
    }

    @Override
    public String getIconType() {
        return iconType;
    }

    @Override
    public String toJSON() {
        return String.format(JSON_PROPERTY,
                String.format("\"type\": \"%s\", \"label\": \"%s\", \"marker\": \"%s\", \"name\": \"%s\", \"usage\": \"%s\"",
                        getGeometryType(), getLabel(), getIconType(), name, usage));
    }
}
