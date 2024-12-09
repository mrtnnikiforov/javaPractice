package genericsChallenge1;

import java.util.List;

public class Line implements Mappable {
    private List<String> locations;

    public Line(List<String> locations) {
        this.locations = locations;
    }

    @Override
    public void render() {
        String formattedLocations = String.join(", ", locations);
        System.out.println("Render as LINE (" + formattedLocations + ")");
    }

    public List<String> getLocations() {
        return locations;
    }
}

