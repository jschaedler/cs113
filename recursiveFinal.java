public class recursiveFinal {
    public static int recprod(int[] a, int count) {
        if (count == 1)
            return a[0];
        else
            return recprod(a, count - 1) * a[count - 1];
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println(recprod(a, 4));
    }

}
