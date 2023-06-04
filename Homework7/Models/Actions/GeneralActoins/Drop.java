package OOPHomeworksByKulik.Homework7.Models.Actions.GeneralActoins;

import OOPHomeworksByKulik.Homework7.Models.Equipment.Portable;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Heroe;

public class Drop implements GeneralAction {

    protected Heroe taker;
    protected Portable item;

    public Drop(Heroe taker, Portable item) {
        this.taker = taker;
        this.item = item;
    }

    public void drop() {
        item.drop();
        taker.useEquipment().drop(item);
    }
    public void drop(int index) {
        item.drop();
        taker.useEquipment().drop(0);
    }

}
