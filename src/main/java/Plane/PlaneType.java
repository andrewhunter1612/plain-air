package Plane;

public enum PlaneType {
    BOEING747(400, 10000, 4, 2);

    private final int capacity;
    private final int massCapacity;
    private final int rows;
    private final int seatsPerRow;


    PlaneType(int capacity, int massCapacity, int rows, int seatsPerRow) {
        this.capacity = capacity;
        this.massCapacity = massCapacity;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMassCapacity() {
        return massCapacity;
    }

    public int getRows() {
        return rows;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }
}
