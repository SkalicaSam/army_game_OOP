package entity;

public abstract class Soldier {
    private final String name;

    public Soldier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void printAttack();

    public abstract void report();
}
