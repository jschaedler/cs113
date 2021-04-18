public class TestCoin {
    public static void main(String[] args) {
        MonataryCoin[] coinArray = new MonataryCoin[35];
        int totalValue = 0;
        int headCount = 0;
        for (int i = 0; i < coinArray.length; i++) {
            coinArray[i].setValue((int) Math.random() * 25);
            coinArray[i].flip();
            if (coinArray[i].isHeads()) {
                totalValue += coinArray[i].getValue();
                headCount++;
            }
        }
        double avg = totalValue / headCount;
        System.out.println("The average monatary value for coins with face of heads is " + avg);
    }

}
