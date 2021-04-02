import java.util.Scanner;

public class TestEvens {

    public static int SmallEven(int[] numArray, int target) {
        int count = 0;
        for (int num : numArray) {
            if (num < target & num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] givenArray = { 2, 7, 8, 3, 4, 10 };
        System.out.println("Enter a Target Integer: ");
        int targ = scan.nextInt();
        int smallAndEven = SmallEven(givenArray, targ);
        System.out.println(
                "The number of integers in the array that were smaller than " + targ + " and even was " + smallAndEven);

        scan.close();
    }

}
