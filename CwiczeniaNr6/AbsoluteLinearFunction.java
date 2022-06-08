import java.lang.Math;

class AbsoluteLinearFunction extends LinearFunction {
    private double a;
    private double b;

    public AbsoluteLinearFunction(double a, double b) {
        super(a, b);
    }

    @Override
        public double f(double x) {
        return Math.abs(a*x + b);
    }
}