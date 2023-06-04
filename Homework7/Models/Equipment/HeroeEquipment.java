package OOPHomeworksByKulik.Homework7.Models.Equipment;

import java.util.LinkedList;

import OOPHomeworksByKulik.Homework7.Models.Equipment.Shields.Shield;
import OOPHomeworksByKulik.Homework7.Models.Equipment.Weapons.Weapon;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Heroe;

public class HeroeEquipment {
    protected Weapon mainWeapon;
    protected Weapon backupWeapon;
    protected Equipable shield;
    protected Heroe owner;
    protected LinkedList<Portable> inventory;

    public HeroeEquipment(Heroe owner) {
        this.owner = owner;
        this.inventory = new LinkedList<Portable>();
        this.mainWeapon = null;
        this.shield = null;
    }

    public void take(Portable item) {
        inventory.add(item);
    }

    public void drop(Portable item) {
        inventory.remove(item);
    }

    public void drop(int index) {
        inventory.get(index).drop();
        inventory.remove(index);
    }

    public void clearMainWeapon() {
        owner.setMainAttack(owner.mainAttackLevel() - mainWeapon.getEffect());
        mainWeapon.takeOff();
    }

    public void clearBackupWeapon() {
        owner.setBackupAttack(owner.backupAttackLevel() - backupWeapon.getEffect());
        mainWeapon.takeOff();
    }

    public boolean equipAsMainWeapon(Weapon newWeapon) {

        if (mainWeapon != null)
            clearMainWeapon();

        newWeapon.equip();
        if (newWeapon.inUse) {
            this.mainWeapon = newWeapon;
            owner.setMainAttack(owner.mainAttackLevel() + mainWeapon.getEffect());
        }
        return newWeapon.inUse;

    }

    public boolean equipAsBackupWeapon(Weapon newWeapon) {

        if (backupWeapon != null)
            clearBackupWeapon();

        newWeapon.equip();
        if (newWeapon.inUse) {
            this.backupWeapon = newWeapon;
            owner.setBackupAttack(owner.backupAttackLevel() + backupWeapon.getEffect());
        }
        return newWeapon.inUse;

    }

    public boolean equipAsAShield(Shield newShield) {
        if (backupWeapon != null)
            clearBackupWeapon();

        newShield.equip();
        if (newShield.inUse) {
            this.shield = newShield;
            owner.setDefence(owner.defenceLevel() + shield.getEffect());
        }
        return newShield.inUse;
    }

    public Weapon getMainWeapon() {
        return mainWeapon;
    }

    public Weapon getBackupWeapon() {
        return backupWeapon;
    }

    public Equipable getShield() {
        return shield;
    }

    public Heroe getOwner() {
        return owner;
    }

    public LinkedList<Portable> getInventory() {
        return inventory;
    }

}