import java.util.Scanner;

public class TestMethods {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        MyMethods method1 = new MyMethods();
        int length, width, height;
        System.out.print("Enter length: ");
        length = scan.nextInt();
        System.out.print("Enter width: ");
        width = scan.nextInt();
        System.out.print("Enter height: ");
        height = scan.nextInt();

        System.out.println("\n" + MyMethods.surface(length, width, height));
        System.out.println(method1);
    }

}
