import java.util.Scanner;

public class TestBandBooster {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of Booster 1: ");
        String name1 = scan.next();
        BandBooster booster1 = new BandBooster(name1);

        System.out.print("Enter the name of Booster 2: ");
        String name2 = scan.next();
        BandBooster booster2 = new BandBooster(name2);

        System.out.print("Enter the number of boxes sold for Booster 1 in week one: ");
        booster1.updateSales(scan.nextInt());

        System.out.print("Enter the number of boxes sold for Booster 1 in week two: ");
        booster1.updateSales(scan.nextInt());

        System.out.print("Enter the number of boxes sold for Booster 1 in week three: ");
        booster1.updateSales(scan.nextInt());

        System.out.print("Enter the number of boxes sold for Booster 2 in week one: ");
        booster2.updateSales(scan.nextInt());

        System.out.print("Enter the number of boxes sold for Booster 2 in week two: ");
        booster2.updateSales(scan.nextInt());

        System.out.print("Enter the number of boxes sold for Booster 2 in week three: ");
        booster2.updateSales(scan.nextInt());

        System.out.println(booster1);
        System.out.print(booster2);

        scan.close();
    }

}
