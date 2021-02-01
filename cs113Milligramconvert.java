import java.util.Scanner;

public class cs113Milligramconvert {
    public static void main(String[] args) {
        int milli_left, kilo, grams;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Weight in Milligrams");

        milli_left = scan.nextInt();
        kilo = milli_left / 1000000;
        milli_left %= 1000000;

        grams = milli_left / 1000;
        milli_left %= 1000;

        System.out.println("Kilograms: " + kilo + "\n" + "Grams: " + grams + "\n" + "Milligrams: " + milli_left);

        scan.close();
    }
}
