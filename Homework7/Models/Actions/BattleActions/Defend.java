package OOPHomeworksByKulik.Homework7.Models.Actions.BattleActions;

import java.util.Random;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Fighter;


public class Defend implements BattleAction {

    protected Fighter defender;

    public Defend(Fighter defender) {
        this.defender = defender;
    }

    public void defend() {

        float luck = ((new Random().nextInt(9) - 4) * 0.05F + 1); // +/-20% удача
  
        defender.setDefenceBonus(defender.getFighter().defenceLevel()*0.5F*luck);

    }
   
}
