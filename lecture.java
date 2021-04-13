
public class lecture {
    public static void bDay(String card) {
        String newCard = card.substring(1);
        if (card.length() == 1)
            System.out.println(card);
        else {
            System.out.println(card.charAt(0));
            bDay(newCard);
        }
    }

    public static void main(String[] args) {
        bDay("Happy Birthday");

        int[] arr = { 1, 2, 3, 4, 5 };

        for (int i : arr) {
            System.out.print(i);
            i--;
        }
    }
}