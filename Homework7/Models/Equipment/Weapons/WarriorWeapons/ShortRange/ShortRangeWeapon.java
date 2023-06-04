package OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.ShortRange;

import OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.WarriorWeapon;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.ShortRangers.ShortRangeWarrior;

public class ShortRangeWeapon extends WarriorWeapon {
   
    public ShortRangeWeapon(String name, float strength, int forceSide,int maxRange) {
        super(name, strength, forceSide);
        minRange = 0;
        this.maxRange = maxRange;

 
    }
    @Override
    public void equip(){
        super.equip();
        if (getOwner() instanceof ShortRangeWarrior)   //мастер ближнего боя лучше использует оружие ближнео боя
        increaseEffect(10);

    }


}
