public class Toothpaste {

    private int size;

    public Toothpaste() {
        size = 0;
    }

    public void setSize(int oz) {
        size = oz;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String info = "The weight of the toothpaste is: " + size + " oz";
        return info;
    }
}
