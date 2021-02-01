import java.util.Scanner;

public class cs113GramsPounds {
    public static void main(String[] args) {
        double grams, pounds;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Weight in Grams");
        grams = scan.nextDouble();
        pounds = grams / 453.592;
        System.out.println("Weight in Pounds: " + pounds);

        scan.close();

    }
}
