package People;

public enum CabinRank {
    CAPTAIN("Captain"),
    FIRST_OFFICER("Flight Officer"),
    PURSER("Purser"),
    FLIGHT_ATTENDANT("Flight Attendant");

    private final String rank;

    CabinRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
