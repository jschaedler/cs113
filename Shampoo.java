public class Shampoo {
    private String shampooName;
    private int weight;

    public Shampoo(String pooName, int pooWeight) {
        shampooName = pooName;
        weight = pooWeight;

    }

    public String getshampooname() {

        return shampooName;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        shampooName = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        String info = "the shampoo is: " + shampooName + " and the weight is: " + weight;
        return info;
    }
}
