package OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.ShortRange;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.ShortRangers.Knight;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.ShortRangers.Samurai;

public class Sword extends ShortRangeWeapon {

    public Sword(String name, float strength, int forceSide, int maxRange) {
        super(name, strength, forceSide, maxRange);

    }
    @Override
    public void equip(){
        super.equip();
        if (getOwner() instanceof Knight || getOwner() instanceof Samurai) 
        increaseEffect(20);

    }
    
}
