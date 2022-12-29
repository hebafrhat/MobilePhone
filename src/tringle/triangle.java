package tringle;

public class triangle {
    protected double m_a;
    protected double m_b;
    protected double m_c;
    protected double m_h;

    public triangle(double a, double b, double c, double h) {
        this.m_a = a;
        this.m_b = b;
        this.m_c = c;
        this.m_h= h;
    }

    public triangle() {
    }

    public double getM_a() {
        return m_a;
    }

    public void setM_a(double m_a) {
        this.m_a = m_a;
    }

    public double getM_b() {
        return m_b;
    }

    public void setM_b(double m_b) {
        this.m_b = m_b;
    }

    public double getM_c() {
        return m_c;
    }

    public void setM_c(double m_c) {
        this.m_c = m_c;
    }

    public double getM_h() {
        return m_h;
    }

    public void setM_h(double m_h) {
        this.m_h = m_h;
    }

    @Override
    public String toString() {
        return "triangle{" +
                "m_a=" + m_a +
                ", m_b=" + m_b +
                ", m_c=" + m_c +
                ", m_h=" + m_h +
                '}';
    }

    public double getarea() {
        return m_c * m_h / 2;
    }

    public double gethikaf() {
        return (m_c+m_a+m_b);
    }
}
