import java.util.Scanner;

public class cs113InchesFeet {
    private static Scanner scan;

    public static void main(String[] args) {
        int inches;
        int feet;
        scan = new Scanner(System.in);

        System.out.println("Enter Number of Inches");
        inches = scan.nextInt();
        feet = inches / 12;
        System.out.println("Feet: " + feet);

    }
}
