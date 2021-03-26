package Plane;

public class Plane {

    private int capacity;
    private int mass;

    public Plane(PlaneType type) {
        this.capacity = type.getCapacity();
        this.mass = type.getMassCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMass() {
        return mass;
    }
}
