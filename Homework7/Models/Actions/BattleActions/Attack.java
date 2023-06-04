package OOPHomeworksByKulik.Homework7.Models.Actions.BattleActions;

import java.util.Random;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Fighter;


public class Attack implements BattleAction {

    protected Fighter attacker;
    protected Fighter defender;


    public Attack(Fighter attacker, Fighter defender) {
        this.attacker = attacker;
        this.defender = defender;
     }

    private void attack(float attack) {

        float luck = ((new Random().nextInt(9) - 4) * 0.05F + 1); // +/-20% удача
        float resistence = attack /(defender.getFighter().defenceLevel()+ defender.getDefenceBonus()) / 2F;
        float damage = attack * luck * resistence;

        defender.setHealth(defender.healthLevel()-damage);

    }
    public void backupWeaponAttack() {
        attack(attacker.getFighter().backupAttackLevel());
    }
    public void mainWeaponAttack() {
        attack(attacker.getFighter().mainAttackLevel());
    }

}
