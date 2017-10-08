public class ShapeCalculator extends LineCalc implements Calc2D,Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return circle.getA1()*Shape.PI;

    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
    return rectangle.getA1() * rectangle.getB1();
    }

    @Override
    public double ballVolume(Ball ball) {
    return (4*(Math.pow(ball.getR(),3)*Shape.PI))/3;

    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getA(),3);

    }
}


