package People;

public class Passenger extends People{

    private int bagMass;
    private String seat;

    public Passenger(String name, int mass, int bagMass) {
        super(name, mass);
        this.bagMass = bagMass;
    }

    public Passenger(String name, int mass, String flightNumber, int bagMass, String seat) {
        super(name, mass, flightNumber);
        this.bagMass = bagMass;
        this.seat = seat;
    }

    public int getBagMass() {
        return bagMass;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
