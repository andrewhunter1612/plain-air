package People;

public class CabinCrew extends People{

    private String rank;

    public CabinCrew(String name, int mass, CabinRank rank) {
        super(name, mass);
        this.rank = rank.getRank();
    }
}
