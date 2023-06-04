package OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.MagicWeapon;

import OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.Weapon;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Wizards.Wizard;

public class MagicWeapon extends Weapon {

    protected int manaUse;

    public MagicWeapon(String name, float strength, int forceSide, int manaUse) {
        super(name, strength, forceSide);
        this.manaUse = manaUse;
        this.maxRange = 200;
        this.minRange = 0;

    }

    @Override
    public void equip() {
        if (getOwner() instanceof Wizard) 
            super.equip(); // магическим оруием пользуются только маги

    }

}
