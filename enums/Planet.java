package enums;

public enum Planet {
    MERCURY("Mercury", 0.90),
    VENUS("Venus", 0.90);

    private final String name;
    private final double distanceFormSun;
    Planet(String name, double distanceFormSun) {
        this.name = name;
        this.distanceFormSun = distanceFormSun;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFormSun() {
        return distanceFormSun;
    }
}
