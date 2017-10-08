public class Rectangle extends GeometricShape{



    public Rectangle(String shapeName, double a1, double b1) {
        super(shapeName, a1, b1);
    }



   public String toString(){
       return super.toString() + " o bokach " + super.getA1() + ", " + super.getB1();
    }

}
