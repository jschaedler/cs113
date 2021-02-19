
public class MyMethods {

    public static int surface(int length, int width, int height) {

        return 2 * length * width + 2 * length * height + 2 * height * width;
    }

    public String swapFaceValues() {

        Die die1 = new Die();
        Die die2 = new Die();

        int value1 = die1.getFaceValue();
        int value2 = die2.getFaceValue();

        die1.setFaceValue(value2);
        die2.setFaceValue(value1);

        String number = "The first values for the die are " + value1 + " and " + value2 + ". The new values are " + die1
                + " and " + die2;

        return number;

    }

    public String toString() {
        String finalstring = new String(swapFaceValues());
        return finalstring;
    }
}
