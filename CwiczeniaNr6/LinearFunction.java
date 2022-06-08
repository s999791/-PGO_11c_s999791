class LinearFunction extends Function {
    private double a;
    private double b;

    public LinearFunction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double f(double x) {
        return a*x + b;
    }

    @Override
    public void increaseCoefficientsBy(double delta) {
        this.a += delta;
        this.b += delta;
    }

    @Override
    public void decreaseCoefficientsBy(double delta) {
        this.a -= delta;
        this.b -= delta;
    }
}