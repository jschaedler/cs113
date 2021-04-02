import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("Target Sales: ");
        int target = scan.nextInt();

        System.out.println("\nSalesperson Sales");
        System.out.println(" ------------------ ");
        int maxSale = sales[0];
        int minSale = sales[0];
        int currentSale = 0;
        sum = 0;
        for (int i = 0; i < sales.length; i++) {

            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
            if (sales[i] > currentSale)
                maxSale = i;
            if (sales[i] < currentSale)
                minSale = i;

            currentSale = sales[i];
        }

        for (int pos = 0; sales[pos] < sales.length; pos++) {
            if (sales[pos] > target) {
                System.out.println("Salesperson: " + pos + " Number of sales: " + sales[pos]);

            }
        }

        int average = sum / sales.length;
        System.out.println("Average sales: " + average);
        System.out.println("Max sales " + sales[maxSale] + " by sales person " + maxSale);
        System.out.println("Max sales " + sales[minSale] + " by sales person " + minSale);
        System.out.println("\nTotal sales: " + sum);
        scan.close();
    }
}
