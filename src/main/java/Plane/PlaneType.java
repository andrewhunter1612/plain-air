package Plane;

public enum PlaneType {
    BOEING747(400, 10000);

    private final int capacity;
    private final int massCapacity;

    PlaneType(int capacity, int massCapacity) {
        this.capacity = capacity;
        this.massCapacity = massCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMassCapacity() {
        return massCapacity;
    }
}
