import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        int[] myArray = new int[51];
        Scanner scan = new Scanner(System.in);
        int currentInt;
        for (int i = 5; i > 0; i--) {
            System.out.println("Enter a number between 0 and 50");
            currentInt = scan.nextInt();
            myArray[currentInt - 1]++;
        }
        for (int i = 0; i <= 50; i++) {
            if (myArray[i] >= 1) {
                System.out.println("Value : " + (i + 1) + "   Count: " + myArray[i]);

            }
        }
        scan.close();
    }

}
