import java.util.*;

public class TestCoin {
    public static void main(String[] args) {
        Random rand = new Random();
        MonataryCoin[] coinArray = new MonataryCoin[35];
        int totalValue = 0;
        int headCount = 0;
        for (int i = 0; i < coinArray.length; i++) {
            MonataryCoin tempCoin = new MonataryCoin();
            coinArray[i] = tempCoin;
            coinArray[i].setValue(rand.nextInt(25));
            coinArray[i].flip();
            if (coinArray[i].isHeads()) {
                totalValue += coinArray[i].getValue();
                headCount++;
            }
        }
        float avg = (float) totalValue / (float) headCount;
        String floatString = String.format("%.2f", avg);

        System.out.println("The average monatary value for coins with face of heads is " + floatString);
    }

}
