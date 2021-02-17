import java.util.Scanner;

public class MyMethods {
    Scanner scan = new Scanner(System.in);

    public int surface() {

        System.out.println("Enter length: ");
        System.out.println("Enter width: ");
        System.out.println("Enter height: ");

        int length = scan.nextInt();
        int width = scan.nextInt();
        int height = scan.nextInt();

        return 2 * length * width + 2 * length * height + 2 * height * width;
    }

    public String swapFaceValues() {

        Die die1 = new Die();
        Die die2 = new Die();

        die1.roll();
        die2.roll();

        int value1 = die1.getFaceValue();
        int value2 = die2.getFaceValue();

        die1.setFaceValue(value2);
        die2.setFaceValue(value1);

        String number = "The first values for the die are " + value1 + " and " + value2 + ". The new values are " + die1
                + " and " + die2;

        return number;

    }

    public String toString() {
        String methods = new String("The surface area is: " + surface() + "\n" + swapFaceValues());
        return methods;
    }
}
