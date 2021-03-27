package People;

public abstract class People {

    private String name;
    private int mass;
    private String flightNumber;

    public People(String name, int mass, String flightNumber) {
        this.name = name;
        this.mass = mass;
        this.flightNumber = flightNumber;
    }

    public People(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
