public abstract class shape {
    protected String shapeName;

    public shape(String shape) {
        shapeName = shape;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }

}
