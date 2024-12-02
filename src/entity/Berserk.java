package entity;

public class Berserk extends Soldier {
    private final String type = "DEFENSIVE";
    private final int damage = 3;

    public Berserk(String name) {
        super(name);
    }

    @Override
    public void printAttack() {
        System.out.println(
                "Soldier " + super.getName() + " deals " + this.damage + " damage"
        );
    }


    @Override
    public void report() {
        System.out.println(
                "Soldier " + super.getName() + " here. " + "Type - " + this.type
        );
    }
}
