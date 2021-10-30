package functions;

import functions.meta.*;

public class Functions {
    private Functions() {}

    public static Function shift(Function f, double shiftX, double shiftY) {
        return new functions.meta.Shift(f, shiftX, shiftY);
    }
    public static Function scale(Function f, double scaleX, double scaleY) {
        return new Scale(f, scaleX, scaleY);
    }
    public static Function power(Function f, double power) {
        return new functions.meta.Power(f, power);
    }
    public static Function sum(Function f1, Function f2) {
        return new Sum(f1, f2);
    }
    public static Function mult(Function f1, Function f2) {
        return new functions.meta.Mult(f1, f2);
    }
    public static Function composition(Function f1, Function f2) {
        return new functions.meta.Composition(f1, f2);
    }
}
