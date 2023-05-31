package OOPHomeworksByKulik.Homework5.models.operations;

import OOPHomeworksByKulik.Homework5.models.ComplexNumber;

public abstract class MathOperation {
    public static ComplexNumber plus(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.re + b.re, a.im + b.im);
    }

    public static ComplexNumber minus(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.re - b.re, a.im - b.im);
    }

}
