import java.util.Scanner;

public class cs113InchesFeet {

    public static void main(String[] args) {
        int inches;
        int feet;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of Inches");
        inches = scan.nextInt();
        feet = inches / 12;
        System.out.println("Feet: " + feet);

        scan.close();
    }
}
