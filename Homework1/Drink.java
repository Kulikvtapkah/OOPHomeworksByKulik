package OOPHomeworksByKulik.Homework1;



public class Drink extends Product {
    protected double volume;

    public Drink(String name, double price, double quantity, String unit, double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
       
    }

    @Override
    public String toString() {
        String parameters = String.format("%sОбъем: %s л.\n", super.toString(), volume);

        return parameters;
    }
}
