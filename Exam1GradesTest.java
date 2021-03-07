
import java.util.*;

public class Exam1GradesTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Type a number grade");
        Exam1part3q11 entry = new Exam1part3q11(scan.nextInt());
        System.out.println(entry);
        Exam1part3q11 randEntry = new Exam1part3q11(rand.nextInt(61) + 40);

        int count = 0;
        while (entry.equals(randEntry)) {
            System.out.println(randEntry);
            if (randEntry.getGrade() > entry.getGrade()) {
                randEntry = new Exam1part3q11(rand.nextInt(61) + 40);
                count++;

            }

        }
        System.out.println(count);
        scan.close();

    }

    public int compStrings(String s1, String s2) {
        int length = Math.min(s1.length(), s2.length());
        int i;
        int total = 0;
        for (i = 0; i < length; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                total++;
            }
        }
        return total;

    }

}
