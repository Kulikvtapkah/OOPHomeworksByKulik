package OOPHomeworksByKulik.Homework3;

public class InvalidGeometryExeption extends Exception {

    String message;

    public InvalidGeometryExeption(String message) {
        this.message = message;

    }

    @Override
    public String toString() {
        return String.format("\nНевозможная фигура: %s", message);
    }

}
