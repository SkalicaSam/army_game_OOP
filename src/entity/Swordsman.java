package entity;

import interfaces.SoldierComand;
import enums.TypeOfFight;

public class Swordsman extends Soldier implements SoldierComand {
    private final TypeOfFight typeOfFight = TypeOfFight.ADAPTABLE;

    public Swordsman(String name, Integer dealDamage) {
        super(name, dealDamage);
    }

    @Override
    public void report() {
        System.out.println(
                "Soldier " + super.getName() + " here. " + "Type - " + this.typeOfFight
        );
    }

}
