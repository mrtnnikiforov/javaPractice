package interfaceChallenge1;

public class UtilityLine implements Mappable {
    private String name;
    private UtilityType utilityType;
    private String iconType;
    private Geometry geometryType;

    public UtilityLine(String name, UtilityType utilityType, String iconType, Geometry geometryType) {
        this.name = name;
        this.utilityType = utilityType;
        this.iconType = iconType;
        this.geometryType = geometryType;
    }

    public String getName() {
        return name;
    }

    public UtilityType getUtilityType() {
        return utilityType;
    }

    @Override
    public String getLabel() {
        return name + " (" + utilityType + ")";
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
                        getGeometryType(), getLabel(), getIconType(), name, utilityType));
    }
}
