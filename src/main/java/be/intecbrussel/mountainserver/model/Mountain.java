package be.intecbrussel.mountainserver.model;

public class Mountain {

    private long id;
    private String name;
    private double height;

    public Mountain(long id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
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
}
