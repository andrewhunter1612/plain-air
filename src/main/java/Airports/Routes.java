package Airports;

public enum Routes {
    GLA_EDI("Glasgow", "Edinburgh", 30);

    private final String startCity;
    private final String endCity;
    private final int timeMins;

    Routes(String startCity, String endCity, int timeMins) {
        this.startCity = startCity;
        this.endCity = endCity;
        this.timeMins = timeMins;
    }

    public String getStartCity() {
        return startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public int getTimeMins() {
        return timeMins;
    }
}
