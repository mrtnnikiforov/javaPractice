package genericsChallenge1;

public class Point implements Mappable {
    private String location;

    public Point(String location) {
        this.location = location;
    }

    @Override
    public void render() {
        System.out.println("Render as POINT (" + location + ")");
    }

    public String getLocation() {
        return location;
    }
}

