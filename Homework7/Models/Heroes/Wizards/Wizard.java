package OOPHomeworksByKulik.Homework7.Models.Heroes.Wizards;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Heroe;

public class Wizard extends Heroe{

    protected float maxMana;

    public float getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(float maxMana) {
        this.maxMana = maxMana;
    }

    public Wizard(String name, float health, float attack, float defence, float maxMana, int forceSide) {
        super(name, health, attack, defence, forceSide);
        this. maxMana = maxMana;
        //TODO Auto-generated constructor stub
    }
    
}
