package tringle;

public class equaleSides extends triangle{

    private double a;
    private double b;
    private double c;
    private double h;

    public equaleSides(double a, double b, double c, double h, double a1, double b1, double c1, double h1) {
        super(a, b, c, h);
        this.a = a1;
        this.b = b1;
        this.c = c1;
        this.h = h1;
    }

    public equaleSides(double a, double b, double c, double h) {
        super(a, b, c, h);
    }

    public double getAreaEqualSides() {
        return this.h*this.c/2;
    }

    public double gethikafequal() {
        return (a+b+c);
    }
}
