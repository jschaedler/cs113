
public class testDice {

    public static void main(String[] args) {

        Die die1 = new Die();
        Die die2 = new Die();
        System.out.println(die1 + "\n" + die2);
        die1.roll();
        die2.roll();

        System.out.println(die1 + "\n" + die2);
        die2.setFaceValue(3);
        System.out.println(die2);
    }
}