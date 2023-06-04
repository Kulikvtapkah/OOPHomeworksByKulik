package OOPHomeworksByKulik.Homework7.Models.Actions.GeneralActoins;

import OOPHomeworksByKulik.Homework7.Models.Equipment.Portable;
import OOPHomeworksByKulik.Homework7.Models.Heroes.Heroe;

public class Take implements GeneralAction {

    protected Heroe taker;
    protected Portable item;

    public Take(Heroe taker, Portable item) {
        this.taker = taker;
        this.item = item;
    }

    public void take() {
        if (item.getOwner() == null){
        item.take(taker);
        taker.useEquipment().take(item);}
    }

}
