package OOPHomeworksByKulik.Homework1;



public class HygieneProduct extends Product {
    protected int numberInPack;

    public HygieneProduct(String name, double price, double quantity, String unit, int numberInPack) {
        super(name, price, quantity, unit);
        this.numberInPack = numberInPack;
       
    }

    @Override
    public String toString() {
        String parameters = String.format("%sШтук в упаковке: %s\n", super.toString(), numberInPack);

        return parameters;
    }
}
