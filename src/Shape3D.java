public class Shape3D extends Shape{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape3D(String shapeName, String color) {
        super(shapeName);
        this.color = color;
    }

    public String toString (){
        return super.toString() + ", kolor: " + color;
    }
}
