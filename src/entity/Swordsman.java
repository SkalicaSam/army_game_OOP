package entity;

public class Swordsman extends Soldier {
    private final String typeOfFight = "ADAPTABLE";
    private final int damage = 5;

    public Swordsman(String name) {
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
                "Soldier " + super.getName() + " here. " + "Type - " + this.typeOfFight
        );
    }


}
