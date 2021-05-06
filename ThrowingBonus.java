import java.util.Scanner;

public class ThrowingBonus {
    public static void main(String[] args) throws BonusTooLowException {
        Scanner scan = new Scanner(System.in);
        BonusTooLowException problem = new BonusTooLowException("The bonus value is too low.");
        System.out.println("How many executives are there? ");
        Executive[] array = new Executive[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter Employee Name ");
            String name = scan.nextLine();
            System.out.println("Enter Employee Adress ");
            String adress = scan.nextLine();
            System.out.println("Enter Employee Phone ");
            String phone = scan.nextLine();
            System.out.println("Enter Employee Social #");
            String social = scan.nextLine();
            System.out.println("Enter Employee Rate ");
            double rate = scan.nextDouble();
            array[i] = new Executive(name, adress, phone, social, rate);
            System.out.println("Enter Employee Bonus");
            int bonus = scan.nextInt();
            if (bonus < 1000)
                throw problem;
            array[i].awardBonus(bonus);
        }
        scan.close();
    }

}
