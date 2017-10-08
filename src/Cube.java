public class Cube extends Shape3D {
    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public Cube(String shapeName, String color, double a) {
        super(shapeName, color);
        this.a = a;
    }

    @Override
    public String toString() {
        return super.toString() + ", o wartości boku: " + getA();
    }
}
