public class labRecursion {

    public static int power(int base, int exp) {
        int power;
        if (exp == 0)
            power = 1;

        else
            power = base * power(base, exp - 1);

        return power;

    }

    public static int numDigits(int num) {
        if (num < 10)
            return 1;
        else
            return (1 + numDigits(num / 10));
    }

    public static int sumDigits(int num) {
        if (num < 10)
            return num;
        else
            return (num % 10 + sumDigits(num / 10));
    }

    public static boolean isPalendrome(String s) {
        if (s.length() <= 1)
            return true;
        else {
            if (s.charAt(0) == s.charAt(s.length() - 1))
                return isPalendrome(s.substring(1, s.length() - 1));
            else
                return false;
        }
    }

    public static void printBackwords(String line) {
        if (line.length() <= 1)
            System.out.println(line);
        else
            printBackwords(line.substring(1));
        System.out.print(line.charAt(0));
    }

    public static void main(String[] args) {

        System.out.println(numDigits(31173));

    }

}