package tringle;

public class with90 extends triangle{
    private double a;
    private double b;
    private double c;

    public with90(double a1, double b1, double c1) {
        this.a = a1;
        this.b = b1;
        this.c = c1;
    }

    public double getAreaWith90() {
        return this.a*this.c/2;
    }

    public double gethikaf90() {
        return (a+b+c);
    }
}
