
public class TestDice {

    public static void main(String[] args) {
        Die tempDie = new Die();
        System.out.println(tempDie);
        Die[] diceArray = new Die[50];
        for (int i = 0; i < 50; i++) {
            tempDie.roll();
            diceArray[i] = tempDie;
        }

        int count = 0;
        for (Die d : diceArray) {
            d.roll();
            int value = d.getFaceValue();
            if (value % 2 == 0) {
                count++;
            }

        }

        System.out.println("The number of die that have an even face value is " + count);
    }
}