package OOPHomeworksByKulik.Homework7.Models.Actions.BattleActions;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Fighter;


public class Heal implements BattleAction {

    protected Fighter healer;

    public Heal(Fighter healer) {
        this.healer = healer;
    }

    public void defend() {

        float newHealth = healer.getFighter().getMaxHealth()*0.2F + healer.healthLevel();
        if (newHealth > healer.getFighter().getMaxHealth())
        newHealth = healer.getFighter().getMaxHealth();

        healer.setHealth(newHealth);

    }
   
}
