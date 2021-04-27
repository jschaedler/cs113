public class Cylinder extends shape {
    private double radius, height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area() {
        return 2 * Math.PI * radius * height;
    }

    public String toString() {
        return super.toString() + "\t radius: " + radius + "\t height: " + height;
    }

}
