package entity;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<Soldier> soldiers;

    public Army() {
        this.soldiers = new ArrayList<>();
    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public void report() {
        System.out.println("-------REPORT-------");
        soldiers.stream()
                .forEach(soldier -> soldier.report());
        System.out.println("-------ENDING-REPORT-------");
    }

    public void armyAttack() {
        System.out.println("-------ATTACK-------");
        for (Soldier soldier : soldiers) {
            soldier.printAttack();
        }
    }

    public void defend() {
        System.out.println("-------DEFEND-------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Swordsman) {
                soldier.printAttack();
            }
        }
    }

    public void furyAttack() {
        System.out.println("-------FURY-ATTACK-------");
        soldiers.stream()
                .filter(soldier -> soldier instanceof Swordsman || soldier instanceof Berserk)
                .forEach(soldier -> soldier.printAttack());
    }


}
