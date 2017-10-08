public abstract class Shape {
private String shapeName;

public static final double PI = Math.PI;

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String toString() {
        return shapeName;
    }
}
