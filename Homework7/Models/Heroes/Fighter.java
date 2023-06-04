package OOPHomeworksByKulik.Homework7.Models.Heroes;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Wizards.Wizard;

public class Fighter {
    protected Heroe fighter;
    protected int position;
    protected float defenceBonus;
    protected float health;
    protected float mana;
    protected int shots;
    

    public Fighter(Heroe fighter, int position) {
        this.fighter = fighter;
        this.position = position;
        defenceBonus = 0;
        health = fighter.maxHealth;
        if (fighter instanceof Wizard)
        mana = ((Wizard) fighter).getMaxMana();
        shots = 10;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public float getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(float defenceBonus) {
        this.defenceBonus = defenceBonus;
    }

    public float healthLevel() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public Heroe getFighter() {
        return fighter;
    }

    
}
