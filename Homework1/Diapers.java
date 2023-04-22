package OOPHomeworksByKulik.Homework1;

// * 11.1 Размер

// * 11.2 Минимальный вес
// * 11.3 Максимальный вес
// * 11.4 Тип

public class Diapers extends ForChildren {
    protected int diaperSize;
    protected int minWeight;
    protected int maxWeight;
    protected String diaperType;

    public Diapers(String name, double price, double quantity, 
                    String unit, int minAge, boolean hypoallergenic, 
                    int diaperSize, int minWeight, int maxWeight, String diaperType) {
        super(name, price, quantity, unit, minAge, hypoallergenic);
        this.diaperSize = diaperSize;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.diaperType = diaperType;
    }

    @Override
    public String toString() {
        String parameters = String.format("%sРазмер: %s\nВес: от %s до %s кг.\nТип: %s\n", 
        super.toString(), diaperSize, minWeight, maxWeight, diaperType);
       
        return parameters;
    }
}
