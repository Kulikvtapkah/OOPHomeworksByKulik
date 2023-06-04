package OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.LongRange;

import OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons.WarriorWeapon;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.LongRangers.LongRangeWarrior;

public class LongRangeWeapon extends WarriorWeapon {

    public LongRangeWeapon(String name, float strength, int forceSide, int maxRange) {
        super(name, strength, forceSide);
        minRange = 1;
        this.maxRange = maxRange;

    }

    @Override
    public void equip(){
        super.equip();
        if (getOwner() instanceof LongRangeWarrior)   //мастер дальнего боя лучше использует это оружие 
        increaseEffect(10);

    }
}
