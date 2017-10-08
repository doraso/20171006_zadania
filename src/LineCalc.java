public class LineCalc {
    private Line2D line;

    public Line2D getLine() {
        return line;
    }

    public double lineLength(Line2D line) {
        return Math.sqrt(Math.pow(line.getA2() - line.getA1(), 2) + Math.pow(line.getB2() - line.getB1(), 2));
    }
}
