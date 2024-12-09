package genericsChallenge1;

import java.util.List;

public class River extends Line {
    private String name;

    public River(String name, List<String> locations) {
        super(locations);
        this.name = name;
    }

    @Override
    public void render() {
        String formattedLocations = String.join(", ", getLocations());
        System.out.println("Render " + name + " as LINE (" + formattedLocations + ")");
    }
}
