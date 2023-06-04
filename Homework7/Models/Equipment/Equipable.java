package OOPHomeworksByKulik.Homework7.Models.Equipment;

public abstract class Equipable extends Portable {

    private final float strength;
    protected float bonusEffect;
    protected boolean inUse;
    protected final int forceSide; // -1 - Темная сторона; +1 - Светлая; 0 - нейтральная


    public Equipable(String name, float strength, int forceSide) {
        super(name);
        this.strength = strength;
        this.forceSide = forceSide;
        inUse = false;
        bonusEffect = 0F;
    }



    public void equip() {
        inUse = true;
        setBonusEffect(calculateBonus());

    }

    public void takeOff() {
        inUse = false;
        setBonusEffect(0);
    }

    private float calculateBonus() {

        float sameSideBonus = owner.getForceSide() * this.forceSide * 0.3F * strength;
        // + 30% к силе оружия, если темный воин вооружен темным оружием и наоборот;
        // -30% при несовпадении стороны
        // 0 - если оружие и/или воин нейтральны
        return strength + sameSideBonus;

    }

    public float getEffect() {
        return bonusEffect;

    }

    public void setBonusEffect(float newBonus) {
        bonusEffect = newBonus;
    }

    public void increaseEffect(int increasePercent) {
        bonusEffect = bonusEffect + bonusEffect * increasePercent * 0.01F;
    }

    public float getStrength() {
        return strength;
    }

    public int getForceSide() {
        return forceSide;
    }
}
