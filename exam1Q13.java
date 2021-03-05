import java.util.*;

public class exam1Q13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter string one: ");
        String string1 = scan.nextLine();
        System.out.println("Enter string two: ");
        String string2 = scan.nextLine();

        float avg = (string1.length() + string2.length()) / (float) 2;
        System.out.println(avg);

        if (string1 == string2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        int random1 = rand.nextInt(string1.length());
        int random2 = rand.nextInt(string2.length());
        System.out.println(string1.charAt(random1) + ", " + string2.charAt(random2));

        scan.close();

    }

}
