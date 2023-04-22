package OOPHomeworksByKulik.Homework1;



public class Milk extends Drink {
    protected double fat;
    protected String expirationDate;

    public Milk(String name, double price, double quantity, String unit, double volume, double fat, String expirationDate) {
        super(name, price, quantity, unit, volume);
        this.fat = fat;
        this.expirationDate = expirationDate;
       
    }

    @Override
    public String toString() {
        String parameters = String.format("%sЖирность: %s%% \nГоден до: %s\n", super.toString(), fat, expirationDate);

        return parameters;
    }
}
