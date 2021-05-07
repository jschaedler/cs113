public class Line extends Figure {
    private Point a, b;

    public Line(String s, Point a, Point b) {
        super(s);
        this.a = a;
        this.b = b;
    }

    public double perimeter() {
        return a.distance(b);
    }

    public void setPointA(int x, int y) {
        a = new Point(x, y);
    }

    public void setPointB(int x, int y) {
        b = new Point(x, y);
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public Point getPointA() {
        return a;
    }

    public Point getPointB() {
        return b;
    }

    public boolean equals(Line x) {
        return a.distance(b) == x.perimeter();
    }
}
