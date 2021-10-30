package functions.basic;

public class Sin extends functions.basic.TrigonometricFunction {
    @Override
    public double getFunctionValue(double x) {
        return Math.sin(x);
    }
}
