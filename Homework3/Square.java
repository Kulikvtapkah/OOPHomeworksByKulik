package OOPHomeworksByKulik.Homework3;

public class Square extends Rectangle {

    protected double side;

    protected Square(double side) throws InvalidGeometryExeption {
        super(side, side);
    }

}
