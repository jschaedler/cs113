public class MonataryCoin extends Coin {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int v) {
        value = v;
    }

    public String toString() {
        String info = "The coin is worth: " + value;
        return info;
        super.toString();

    }
}
