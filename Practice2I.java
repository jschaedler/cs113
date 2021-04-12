import java.util.Arrays;

public class Practice2I {
    public static int[] firstFewOdds(int[] numArray, int target) {
        int[] odds = new int[target];

        for (int i = 0; i < target; i++) {
            odds[i] = -1;
        }
        int oddsIndex = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 != 0) {
                odds[oddsIndex] = numArray[i];
                oddsIndex++;
            }
        }

        return odds;
    }

    public static void main(String[] args) {
        int[] my_array = { 2, 3, 4, 5, 6, 7, 8, 10, 1 };
        System.out.println(Arrays.toString(firstFewOdds(my_array, 7)));
    }
}
