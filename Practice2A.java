public class Practice2A {
    private float radius;
    private Point center;

    public Practice2A(float radius, Point center) {
        this.radius = radius;
        this.center = center;

    }

    public Point getPoint() {
        return center;

    }

    public void setRadius(float r) {
        radius = r;

    }

    public boolean liesOnCircle(Point p) {
        return (center.distance(p) == radius);
    }
}
