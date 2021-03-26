package People;

public abstract class People {

    private String name;
    private int mass;

    public People(String name, int mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public int getmass() {
        return mass;
    }
}
