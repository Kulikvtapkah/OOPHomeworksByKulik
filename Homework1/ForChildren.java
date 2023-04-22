package OOPHomeworksByKulik.Homework1;

public class ForChildren extends Product {
    protected int minAge;
    protected boolean hypoallergenic;

    public ForChildren(String name, double price, double quantity, String unit, int minAge, boolean hypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;

    }

    @Override
    public String toString() {
        String parameters = String.format("%sВозраст: от %s лет\n", super.toString(), minAge);
        if (hypoallergenic) {
            parameters = String.format("%sГипоаллергенно\n", parameters);
        }
        return parameters;
    }
}
