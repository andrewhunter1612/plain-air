package People;

public class Passenger extends People{

    private int bagMass;

    public Passenger(String name, int mass, int bagMass) {
        super(name, mass);
        this.bagMass = bagMass;
    }

    public int getBagMass() {
        return bagMass;
    }

}
