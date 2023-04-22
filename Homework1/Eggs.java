package OOPHomeworksByKulik.Homework1;



public class Eggs extends Food {
    protected int numberInPack;

    public Eggs(String name, double price, double quantity, String unit, String expirationDate, int numberInPack) {
        super(name, price, quantity, unit, expirationDate);
        this.numberInPack = numberInPack;
       
    }

    @Override
    public String toString() {
        String parameters = String.format("%sКоличество в упаковке: %s шт.\n", super.toString(), numberInPack);
        return parameters;
    }
}
