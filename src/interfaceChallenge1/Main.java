package interfaceChallenge1;

public class Main {
    public static void main(String[] args) {
        Building townHall = new Building("Sydney Town Hall", UsageType.GOVERNMENT, "RED STAR", Geometry.POINT);
        Building library = new Building("City Library", UsageType.PUBLIC_SERVICE, "BLUE CIRCLE", Geometry.POINT);
        UtilityLine fiberOptic = new UtilityLine("College St", UtilityType.FIBER_OPTIC, "GREEN DOTTED", Geometry.LINE);
        UtilityLine powerLine = new UtilityLine("Main Rd", UtilityType.ELECTRICIAL, "YELLOW DASHED", Geometry.LINE);

        System.out.println(townHall.toJSON());
        System.out.println(library.toJSON());
        System.out.println(fiberOptic.toJSON());
        System.out.println(powerLine.toJSON());

        Mappable.describeMappable(fiberOptic);
        Mappable.describeMappable(townHall);
    }
}
