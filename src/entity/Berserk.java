package entity;
import enums.TypeOfFight;
import interfaces.SoldierComand;


public class Berserk extends Soldier implements SoldierComand {
    private final TypeOfFight typeOfFight = TypeOfFight.DEFENSIVE;

    public Berserk(String name, Integer dealDamage) {
        super(name, dealDamage);
    }

    @Override
    public void report() {
        System.out.println(
                "Soldier " + super.getName() + " here. " + "Type - " + this.typeOfFight
        );
    }
}
