package OOPHomeworksByKulik.Homework7.Models.Heroes;

import OOPHomeworksByKulik.Homework7.Models.Equipment.HeroeEquipment;

public abstract class Heroe {
    protected final String name;
    protected final float maxHealth;
    protected float mainAttack;
    protected float backupAttack;
    protected float defence;


    protected HeroeEquipment equipment;
    protected final int forceSide; // -1 - Темная сторона; +1 - Светлая; 0 - нейтральная

    public Heroe(String name, float health, float attack, float defence, int forceSide) {
        this.name = name;
        this.maxHealth = health;
        this.mainAttack = attack;
        this.backupAttack = attack;
        this.defence = defence;
        this.forceSide = forceSide;
        this.equipment = new HeroeEquipment(this);

    }

    public String getName() {
        return name;
    }




    
    public float mainAttackLevel() {
        return mainAttack;
    }

    public void setMainAttack(float attack) {
        this.mainAttack = attack;
    }


    public float backupAttackLevel() {
        return backupAttack;
    }

    public void setBackupAttack(float attack) {
        this.backupAttack = attack;
    }


    public float defenceLevel() {
        return defence;
    }

    public void setDefence(float defence) {
        this.defence = defence;
    }

    public float getMaxHealth() {
        return maxHealth;
    } 
    

    public int getForceSide() {
        return forceSide;
    }

    public HeroeEquipment useEquipment(){
        return  equipment;
    }
}
