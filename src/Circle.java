public class Circle extends GeometricShape {

    public Circle(String shapeName, double a1) {
        super(shapeName, a1);
    }

    @Override
    public String toString() {
        return super.toString() + " o promieniu= " + super.getA1() ;
    }
}
