public class Rectangle extends shape {

    private double length, width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;

    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "\t lentgh: " + length + "\t width: " + width;
    }

}
