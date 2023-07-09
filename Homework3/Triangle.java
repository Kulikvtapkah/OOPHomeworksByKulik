package OOPHomeworksByKulik.Homework3;

import java.util.Arrays;

public class Triangle extends Polygon {

    protected double sideAB;
    protected double sideBC;
    protected double sideCA;

    protected Triangle(double sideAB, double sideBC, double sideCA) throws InvalidLotParametersExeption {
        super(Arrays.asList(sideAB, sideBC, sideCA));
        this.sideAB = sideAB;
        this.sideCA = sideCA;
        this.sideBC = sideBC;
        triangleValidation(sideAB, sideBC, sideCA);
        this.area = calculateArea(sideAB, sideBC, sideCA);

    }

    private double calculateArea(double sideAB, double sideBC, double sideCA) {
        double p = this.perimeter / 2;
        double area = Math.sqrt(p * (p - sideBC) * (p - sideAB) * (p - sideCA));
        return area;
    }

    @Override
    public void figureInfo() {
        System.out.printf("Треугольник\n");
        System.out.printf("Стороны: %s, %s, %s ед\n", sideAB, sideBC, sideCA);
        super.figureInfo();
    }

    protected void triangleValidation(double sideAB, double sideBC, double sideCA) throws InvalidLotParametersExeption {

        try {
            if (sideAB + sideBC <= sideCA || sideAB + sideCA <= sideBC || sideCA + sideBC <= sideAB)
                throw new InvalidLotParametersExeption(" сторона треугольника не может быть длиннее двух других");
        } finally {
        }

    }

}
