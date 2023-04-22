package OOPHomeworksByKulik.Homework1;



public class Food extends Product {
    protected String expirationDate;

    public Food(String name, double price, double quantity, String unit, String expirationDate) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
       
    }

    @Override
    public String toString() {
        String parameters = String.format("%sГоден до: %s\n", super.toString(), expirationDate);

        return parameters;
    }
}
