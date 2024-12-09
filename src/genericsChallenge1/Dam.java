package genericsChallenge1;

public class Dam extends Point {
    private String name;

    public Dam(String name, String location) {
        super(location);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.println("Render " + name + " as POINT (" + getLocation() + ")");
    }
}
