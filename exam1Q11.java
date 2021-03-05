public class exam1Q11 {

    private int radius;

    public exam1Q11(int r) {
        radius = r;
    }

    public exam1Q11() {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public String toString() {
        String info = "" + radius;
        return info;
    }

    public double area() {
        double area = Math.PI * radius * radius;
        return area;
    }

}
