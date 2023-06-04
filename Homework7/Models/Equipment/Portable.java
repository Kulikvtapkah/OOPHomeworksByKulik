package OOPHomeworksByKulik.Homework7.Models.Equipment;

import OOPHomeworksByKulik.Homework7.Models.Heroes.Heroe;

public abstract class Portable {
    private String name;
    protected Heroe owner;
    

    public Portable(String name) {
        this.name = name;
        this.owner = null;
    }

    public String getName() {
        return name;
    }

    
    public void drop() {
        setOwner(null);
    }

    public void take(Heroe newOwner) {
        setOwner(newOwner);
    }

    public Heroe getOwner() {
        return owner;
    }

    public void setOwner(Heroe owner) {
        this.owner = owner;
    }


}
