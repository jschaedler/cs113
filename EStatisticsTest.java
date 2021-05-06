import java.util.Arrays;

public class EStatisticsTest {

    public static int[] eStatistics(String[] names) {
        int[] e = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            String tempString = names[i];
            for (int c = 0; c < tempString.length(); c++) {
                if (tempString.charAt(c) == 'e')
                    e[i]++;
            }
        }

        return e;
    }

    public static int power(int base, int expo) {
        if (expo == 0)
            return 1;
        else
            return base * power(base, expo - 1);
    }

    public static void main(String[] args) {
        String[] names = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        System.out.println(Arrays.toString(eStatistics(names)));

        System.out.println(power(2, 3));
    }
}
