import java.util.*;

public class TestCoin {
    public static void main(String[] args) {
        Random rand = new Random();
        MonetaryCoin[] coinArray = new MonetaryCoin[35];
        int totalValue = 0;
        int headCount = 0;
        for (int i = 0; i < coinArray.length; i++) {
            MonetaryCoin tempCoin = new MonetaryCoin();
            coinArray[i] = tempCoin;
            if (rand.nextInt(4) == 0)
                coinArray[i].setValue(1);
            if (rand.nextInt(4) == 1)
                coinArray[i].setValue(5);
            if (rand.nextInt(4) == 2)
                coinArray[i].setValue(10);
            if (rand.nextInt(4) == 3)
                coinArray[i].setValue(25);
            coinArray[i].flip();
            if (coinArray[i].isHeads()) {
                totalValue += coinArray[i].getValue();
                headCount++;
            }
        }
        int avg = (int) totalValue / (int) headCount;

        System.out.println("The average monetary value for coins with face of heads is " + avg + " cents.");
    }

}
