import java.text.DecimalFormat;
import java.util.Scanner;

public class NameAverage {

    public static void main(String[] args) {
        String str1, str2, str3;
        int length1, length2, length3;
        float average;

        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.print("Enter three names to find the average number of leters." + "\n" + "Name 1: ");
        str1 = scan.nextLine(); // read name and get length
        length1 = str1.length();

        System.out.print("Name 2: "); // read name and get length
        str2 = scan.nextLine();
        length2 = str2.length();

        System.out.print("Name 3: "); // read name and get length
        str3 = scan.nextLine();
        length3 = str3.length();

        average = (length1 + length2 + length3) / (float) 3; // calculate average

        System.out.println(fmt.format(average));
        System.out.print(str1.substring(0, 1) + str2.substring(0, 1) + str3.substring(0, 1));

        scan.close();
    }
}
