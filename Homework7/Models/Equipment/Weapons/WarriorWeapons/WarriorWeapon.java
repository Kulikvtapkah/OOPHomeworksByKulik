package OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.WarriorWeapons;

import OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.Weapon;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Warriors.Warrior;

public abstract class WarriorWeapon extends Weapon {

    public WarriorWeapon(String name, float strength, int forceSide) {
        super(name, strength, forceSide);

    }

    protected int maxRange;
    protected int minRange;

    @Override
    public void equip() {

        super.equip(); // Обычное оружие подходит всем
        if (getOwner() instanceof Warrior) // но воин оружием воина владеет эффективнее
            increaseEffect(5);
        
    }

}
