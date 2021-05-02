public class ModifiedThrownBonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BonusTooLowException problem = new BonusTooLowException("The bonus value is too low.");
        System.out.println("How many executives are there? ");
        Executive[] array = new Executive[scan.nextInt()];
        int validBonuses = 0;
        Executive tempExec;
        double payCount = 0;
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
            payCount += rate;
            array[i] = new tempExec(name, adress, phone, social, rate);
            System.out.println("Enter Employee Bonus");
            int bonus = scan.nextInt();
            if (bonus > 1000)
                validBonuses++;
            try {
                if (bonus < 1000)
                    throw problem;
            } catch (BonusTooLowException exception) {
                System.out.println("Invalid Bonus Entered");
                bonus = 0;

            }

            array[i].awardBonus(bonus);
        }

        double avgPay = payCount / (double) array.length;
        System.out.println("The number of valid bonuses for all Executives are: " + validBonuses);
        System.out.println("The average pay of Executives is: " + avgPay);

    }

}
