public class MonetaryCoin extends Coin {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int v) {
        value = v;
    }

    public String toString() {

        return "The coin is worth: " + value + super.toString();

    }
}
