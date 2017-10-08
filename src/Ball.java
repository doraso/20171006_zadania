public class Ball extends Shape3D {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Ball(String shapeName, String color, double r) {
        super(shapeName, color);
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() + ", o promieniu: " + getR();
    }
}
