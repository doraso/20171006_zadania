public abstract class Shape2D extends Shape{

    private double a1;
    private double b1;



    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public Shape2D(String shapeName, double a1, double b1) {
        super(shapeName);
        this.a1 = a1;
        this.b1 = b1;
    }

    public Shape2D(String shapeName, double a1) {
        super(shapeName);
        this.a1 = a1;
    }
}
