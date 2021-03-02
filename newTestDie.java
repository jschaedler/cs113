
public class newTestDie {

    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        int rollCount = 1;

        while (die1.compareTo(die2) != 0) {
            System.out.println(die1);
            System.out.println(die2);
            die1.roll();
            die2.roll();
            rollCount++;

        }

        System.out.println("It took " + rollCount + " rolls to make the die equal.");
        int testStats = stats(die1, die2);
        System.out.println("The first iteration die one was greater than die two is iteration: " + testStats);

    }

    public static int stats(Die die1, Die die2) {
        int result = -1;

        for (int i = 0; i < 10; i++) {
            die1.roll();
            die2.roll();
            if (die1.compareTo(die2) == 1) {
                result = i + 1;
                return result;

            }

        }
        return result;

    }
}
