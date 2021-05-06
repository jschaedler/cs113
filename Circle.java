public class Circle {

    /*
     * protected double radius;
     * 
     * public Circle(double r) { radius = r; }
     * 
     * public void setRadius(double r) { radius = r; }
     * 
     * public double getRadius() { return radius; }
     * 
     * public double area() { return Math.PI * radius * radius; }
     * 
     * public String toString() { return "Circle:Radius= " + radius; } }
     */

    private Point center;
    private float radius;

    public Circle(Point p, float r) {
        center = p;
        radius = r;
    }

    public Point getPoint() {
        return center;

    }

    public float getRadius() {
        return radius;
    }

    public Point setPoint(int x, int y) {
        center = new Point(x, y);
        return center;
    }

    public void setRadius(float r) {
        radius = r;
    }

    public String toString() {
        String info = "The point has x and y values: " + "\n" + center + "\nThe radius is: " + radius;
        return info;
    }
}
