package People;

public class Passenger extends People{

    private int bagMass;
    private int numberOfBags;

    public Passenger(String name, int mass, int bagMass, int numberOfBags) {
        super(name, mass);
        this.bagMass = bagMass;
        this.numberOfBags = numberOfBags;
    }

    public int getBagMass() {
        return bagMass;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
