package OOPHomeworksByKulik.Homework1;



public class Bread extends Food {
    protected String flourType;

    public Bread(String name, double price, double quantity, String unit, String expirationDate, String flourType) {
        super(name, price, quantity, unit, expirationDate);
        this.flourType = flourType;
       
    }

    @Override
    public String toString() {
        String parameters = String.format("%sТип муки: %s\n", super.toString(), flourType);
        return parameters;
    }
}
