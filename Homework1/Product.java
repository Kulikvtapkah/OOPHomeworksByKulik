package OOPHomeworksByKulik.Homework1;

/* Название
2. Цена
3. Количество
4. Единица измерения */

public class Product {
    protected String name;
    protected double price;
    protected double quantity;
    protected String unit;

    public Product(String name,
            double price,
            double quantity,
            String unit) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    @Override
    public String toString() {
        String parameters = String.format("Товар: %s \nЦена: %s руб. \nКоличество: %s %s\n",name, price, quantity, unit);
        
        return parameters;
    }
}
