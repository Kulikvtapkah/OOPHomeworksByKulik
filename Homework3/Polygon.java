package OOPHomeworksByKulik.Homework3;

import java.util.LinkedList;
import java.util.List;

import OOPHomeworksByKulik.Homework3.InvalidGeometryExeption;

public abstract class Polygon extends Figure {

    protected double perimeter;

    protected LinkedList<Double> edgesLengths = new LinkedList<>();

    protected Polygon(List<Double> newEedges) throws InvalidGeometryExeption {
        super();
        for (double newEedge : newEedges) {
            this.edgesLengths.add(geometryValidation(newEedge));
        }
        this.perimeter = calculatePerimeter(edgesLengths);
    }

    private double calculatePerimeter(LinkedList<Double> edgesLengths) {
        double perimeter = 0;
        for (double edge : edgesLengths) {
            perimeter += edge;
        }
        return perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }

    @Override
    protected void figureInfo() {
        System.out.printf("Периметр: %s ед\n", perimeter);
        super.figureInfo();

    }

}
