package OOPHomeworksByKulik.Homework3;

public class Circle extends Figure {

    protected double circleLength;
    protected double radius;

    protected Circle(double radius) throws InvalidGeometryExeption {
        super();

        this.radius = geometryValidation(radius);
        this.area = calculateArea(radius);
        this.circleLength = calculateCircLelength(radius);

    }

    private double calculateCircLelength(double radius) {
        double circleLength = Math.PI * (2 * radius);
        return circleLength;
    }

    public double getCircleLength() {
        return circleLength;
    }

    private double calculateArea(double radius) {
        double area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    public void figureInfo() {
        System.out.printf("Окружность\n");
        System.out.printf("Радиус: %s ед\n", radius);
        System.out.printf("Длина окружности: %.2f ед\n", circleLength);
        super.figureInfo();

    }

}
