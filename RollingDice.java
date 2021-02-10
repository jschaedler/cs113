import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        int dice1, dice2, totaldice;
        Random gen = new Random();
        dice1 = gen.nextInt(6) + 1;

        dice2 = (int) (Math.random() * 6 + 1);

        totaldice = dice1 + dice2;

        System.out.println("Die 1: " + dice1);
        System.out.println("Die 2: " + dice2);
        System.out.println("Sum of dice: " + totaldice);

    }
}
