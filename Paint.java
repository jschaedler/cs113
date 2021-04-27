public class Paint {

    private double coverage;

    public Paint(double c) {
        coverage = c;
    }

    public double amount(shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }

}
