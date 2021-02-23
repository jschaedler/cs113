public class TravelKit {
    private Shampoo sh;
    private Toothpaste tooth;

    public TravelKit(Shampoo shamp, Toothpaste paste) {
        sh = shamp;
        tooth = paste;
    }

    public Shampoo getShampoo() {
        return sh;
    }

    public Toothpaste getToothpaste() {
        return tooth;
    }

    public void setShampoo(String kind, int weight) {
        sh.setName(kind);
        sh.setWeight(weight);

    }

    public void setToothpaste(int weight) {
        tooth.setSize(weight);
    }

    public int getTotalSize() {
        int totalSize = sh.getWeight() + tooth.getSize();
        return totalSize;
    }

    public String toString() {
        String info = "" + sh + " oz\n" + tooth;
        return info;
    }

}
