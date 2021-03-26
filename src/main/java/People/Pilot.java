package People;

public class Pilot extends People{

    private String rank;
    private String licence;

    public Pilot(String name, int mass, CabinRank rank, String licence) {
        super(name, mass);
        this.rank = rank.getRank();
        this.licence = licence;
    }

    public String getRank() {
        return rank;
    }

    public String getLicence() {
        return licence;
    }
}
