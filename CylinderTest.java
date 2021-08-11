public class CylinderTest extends Circle {
    private double height;

    public CylinderTest(Point r, Float  h) {
        super(r, h);
        height = h;
    }

    public void setHeight(double h) {
        height = h;

    }

    public double getHeight() {
        return height;
    }

    public boolean equals(CylinderTest c) {
        return c.getHeight() == height && c.getRadius() == radius;
    }

    public double area() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public String toString() {
        return "Cylinder \n radius: " + radius + "\theight: " + height;
    }

}
// Write the definition for a child class of Circle named Cylinder. The cylinder
// should have a double attribute named height. The constructor of the child
// class should take parameters to initialize the attributes. The class Cylinder
// should also include getter and setter method as well as an equals method that
// returns true if two cylinder objects have same dimensions and false
// otherwise.Remember to override method where needed.