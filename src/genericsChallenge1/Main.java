package genericsChallenge1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dam dam1 = new Dam("Aleksandar Stamboliyski", "43.1083, 25.1316");
        Dam dam2 = new Dam("Kardzhali", "41.6333, 25.3667");

        River river1 = new River("Maritsa", Arrays.asList(
                "42.1176, 25.1950",
                "42.1159, 25.2108",
                "42.1180, 25.2315"
        ));

        River river2 = new River("Iskar", Arrays.asList(
                "42.6743, 23.3438",
                "42.6408, 23.4215",
                "42.5989, 23.4825"
        ));


        Layer<Mappable> layer = new Layer<>();

        layer.addElement(dam1);
        layer.addElement(dam2);
        layer.addElement(river1);
        layer.addElement(river2);

        layer.renderLayer();
    }
}
