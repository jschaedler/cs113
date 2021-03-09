public class Runs {
    public static void main(String[] args) {
        final int FLIPS = 10;
        int currentRun = 0;
        int maxRun = 0;
        Coin coin = new Coin();

        for (int i = 0; i < FLIPS; i++) {
            coin.flip();
            System.out.println(coin);
            if (coin.isHeads() == true) {
                currentRun++;
            } else {
                currentRun = 0;
            }
            if (maxRun < currentRun) {
                maxRun = currentRun;
            }

        }

        System.out.println("The most time heads was flipped in a row was " + maxRun);
    }

}
