import entity.Army;
import entity.Berserk;
import entity.Knight;
import entity.Swordsman;

public class Main {
    public static void main(String[] args) {

        Army army1 = new Army();
        Swordsman swordsman1 = new Swordsman("swordsman 1", 2);
        army1.addSoldier(swordsman1);
        army1.addSoldier(new Swordsman("Swordsman 2", 2));
        army1.addSoldier(new Berserk("berserk 1", 10));
        army1.addSoldier(new Berserk("berserk 2", 10));
        army1.addSoldier(new Knight("knight 1", 5));
        army1.addSoldier(new Knight("knight 2", 5));

        army1.report();
        army1.armyAttack();
        army1.defend();
        army1.furyAttack();
    }
}