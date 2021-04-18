public class Practice2H {

    public static void main(String[] args) {
        Practice2G[] vaxArray = new Practice2G[10];
        for (int i = 0; i < 10; i++) {
            VirusStrain tempA = new VirusStrain(new String("H1N1"), (int) Math.random() * 10);
            VirusStrain tempB = new VirusStrain(new String("Bris"), (int) Math.random() * 10);
            Practice2G tempvax = new Practice2G(tempA, tempB);
            vaxArray[i] = tempvax;
        }

        VirusStrain bestH1N1 = new VirusStrain("H1N1", 0);
        VirusStrain bestBris = new VirusStrain("Bris", 0);
        Practice2G bestVax = new Practice2G(bestH1N1, bestBris);
        for (int i = 0; i < 10; i++) {
            if (vaxArray[i].compareTo(bestVax) == 1)
                bestVax = vaxArray[i];

        }

        System.out.println(bestVax);
    }

}
