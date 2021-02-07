import java.util.*;

public class NameApp {
    public static void main(String[] args)

    {
        String first, last;
        int number;
        Scanner scan = new Scanner(System.in);
        Random num = new Random();
        System.out.print("Enter your first name: ");
        first = scan.nextLine();

        System.out.print("Enter your last name: ");
        last = scan.nextLine();

        number = num.nextInt(99) + 1;

        System.out.print(last.substring(0, 1) + first.substring(0, 5) + number);

        scan.close();

    }
}
