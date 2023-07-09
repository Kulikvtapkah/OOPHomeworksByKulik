package OOPHomeworksByKulik.Homework3;

import java.util.Arrays;

public class Rectangle extends Polygon {

    protected double hight;
    protected double width;

    public Rectangle(double hight, double width) throws InvalidLotParametersExeption {
        super(Arrays.asList(hight, hight, width, width));
        this.hight = hight;
        this.width = width;
        this.area = calculateArea(hight, width);
    }

    private double calculateArea(double hight, double width) {
        double area = hight * width;
        return area;
    }

    @Override
    public void figureInfo() {
        if (this instanceof Square) {
            System.out.printf("Квадрат\n");
        } else {
            System.out.printf("Прямоугольник\n");
        }

        System.out.printf("Размеры: %s  х %s ед\n", this.hight, this.width);
        super.figureInfo();
    }

}
