package be.intecbrussel.mountainserver.model;

public class Mountain {

    private long id;
    private String name;
    private double height;
    private String coordinates;

    public Mountain(long id, String name, double height, String coordinates) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.coordinates = coordinates;
    }

    public Mountain() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getCoordinates() {
        return coordinates;
    }
}
