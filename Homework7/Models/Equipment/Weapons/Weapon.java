
package OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons;

import OOPHomeworksByKulik.Homework7.Models.Equipment.Equipable;

public abstract class Weapon extends Equipable {
    protected int maxRange;
    protected int minRange;

    public Weapon(String name, float strength, int forceSide) {
        super(name, strength, forceSide);
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getMinRange() {
        return minRange;
    }

}
