public class Circle {
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
