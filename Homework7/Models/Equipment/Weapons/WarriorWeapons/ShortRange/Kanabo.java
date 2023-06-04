package OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.ShortRange;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.ShortRangers.Samurai;

public class Kanabo extends ShortRangeWeapon {

    public Kanabo(String name, float strength, int forceSide, int maxRange) {
        super(name, strength, forceSide, maxRange);
       
    }
    @Override
    public void equip(){
        super.equip();
        if (getOwner() instanceof Samurai)   
        increaseEffect(10);

    }
    
}
