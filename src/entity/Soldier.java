package entity;

import interfaces.SoldierComand;

public abstract class Soldier implements SoldierComand {
    private final String name;
    public final Integer dealDamage;

    public Soldier(String name, Integer dealDamage) {
        this.name = name;
        this.dealDamage = dealDamage;
    }

    public String getName() {
        return name;
    }

    public void printAttack(){
        System.out.println(
                "Soldier " + this.name + " deals " + this.dealDamage + " damage"
        );
    };

    @Override
    public abstract void report();
}
