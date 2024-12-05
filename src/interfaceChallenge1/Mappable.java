package interfaceChallenge1;

public interface Mappable {
    String getLabel();
    Geometry getGeometryType();
    String getIconType();

    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    default String toJSON(){
        return String.format(JSON_PROPERTY,
                String.format("\"type\": \"%s\", \"label\": \"%s\", \"marker\": \"%s\"",
                        getGeometryType(), getLabel(), getIconType()));
    }

    static void describeMappable(Mappable mappable) {
        System.out.println(mappable.toJSON());
    }

}
