package entity;

public class Knight extends Soldier {
    private final String type = "OFFENSIVE";
    private final int damage = 5;

    public Knight(String name) {
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
