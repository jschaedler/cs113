public class RecursiveMethods {
    public static void printDigits(int num) {
        int remainder = num % 10;
        if (num == 0) {
            System.out.println("");

        } else {
            printDigits(num / 10);
            System.out.println(remainder);
        }

    }

    public static int sumArray(int[] a) {
        int i = a.length;
        int sum;
        if (i == 0)
            sum = 0;
        else
            sum = a[i] + a[i - 1];

        return sum;

    }

    public static int[] pascalTriangle(int n) {
        int[] line = new int[n];
        if (n == 1)
            return new int[] { 1 };
        else {
            line[n - 1] = 1;
            line[0] = 1;
            int[] prevLine = pascalTriangle(n - 1);

            for (int i = 1; i < n - 1; i++) {
                line[i] = prevLine[i - 1] + prevLine[i];

            }
            return line;
        }

    }
}
