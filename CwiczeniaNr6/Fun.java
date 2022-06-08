interface Fun {
    public double f(double x);
    public static double minimum(Fun func, double a, double b, double alpha) {
        double min = Double.MAX_VALUE;
        for(double x = a; x <= b; x += alpha) {
            if(func.f(x) < min) {
                min = func.f(x);
            }
        }
        return min;
    }
}