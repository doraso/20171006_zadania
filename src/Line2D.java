public class Line2D extends Shape2D {
    private double a2;
    private double b2;

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getB2() {
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }

    public Line2D(String shapeName, double a1, double b1, double a2, double b2) {
        super(shapeName, a1, b1);
        this.a2 = a2;
        this.b2 = b2;
    }
}
