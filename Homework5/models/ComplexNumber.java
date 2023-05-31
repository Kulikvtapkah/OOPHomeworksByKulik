package OOPHomeworksByKulik.Homework5.models;

public class ComplexNumber {
    public double re;
    public double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumber(double re) {
        this(re, 0D);
    }

    @Override
    public String toString() {

        if (re == 0 && im == 0)
            return "0";

        else if (re == 0)
            return String.format("%si", im);

        else if (im == 0)
            return String.format("%s", re);
        else if (im < 0)
            return String.format("%s - %si", re, im*(-1));
        else 
        return String.format("%s + %si", re, im);
    }
}
