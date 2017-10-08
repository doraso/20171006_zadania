public class ShapeCalculatorTest {
    public static void main(String[] args) {
        ShapeCalculator shape = new ShapeCalculator();

        Rectangle rectangle = new Rectangle("Prostokąt", 3, 4);
        System.out.println(rectangle);
        double result = shape.rectangleArea(rectangle);
        System.out.println("Pole prostokąta wynosi: " + result);
        Circle circle = new Circle("Okrag", 5);
        System.out.println(circle);
        double result1 = shape.circleArea(circle);
        System.out.println("Pole okręgu wynosi: " + result1);
        Ball ball = new Ball("Kula", "niebieski" , 7 );
        System.out.println(ball);
        double result2 = shape.ballVolume(ball);
        System.out.println("Objętość kuli wynosi: " + result2);
        Cube cube = new Cube("Sześcian", "różowy", 7);
        System.out.println(cube);
        double result3 = shape.cubeVolume(cube);
        System.out.println("Objętość sześcianu wynosi: " + result3);
        Line2D line = new Line2D("Linia", 3,5,7,9);
        double result4 = shape.lineLength(line);
        System.out.println("Długość lini wynosi: " + result4);

        //i można też z rzutowaniem typów
        Shape rectangle1 = new Rectangle("Prostokąt" , 2, 4);
        System.out.println(rectangle1);
        System.out.println("Pole wynosi: " + shape.rectangleArea((Rectangle)rectangle1));
        Shape circle1 = new Circle("Okrąg", 6);
        System.out.println("Pole okręgu wynosi: " + shape.circleArea((Circle)circle1));
        //.....


    }
}
