package OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.LongRange;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.LongRangers.Archer;

public class Bow extends LongRangeWeapon {

    public Bow(String name, float strength, int forceSide, int maxRange) {
        super(name, strength, forceSide, maxRange);

    }

    @Override
    public void equip(){
        super.equip();
        if (getOwner() instanceof Archer)   
        increaseEffect(20);

    }
    
}
