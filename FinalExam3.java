import javax.lang.model.util.ElementScanner6;

public class FinalExam3 {

    public static boolean checkString(String s) {
        if (s.charAt(s.length() - 1) == s.charAt(0) && s.length() == 1)
            return true;
        else
            return checkString(s.substring(1));
    }

    public static int[] testCoffeeDrinks(CoffeeDrink[] drinks) {
        int[] strengths = new int[5];
        CoffeeDrink maxStrength = drinks[0];
        for (int i = 0; i < drinks.length - 1; i++) {
            if (drinks[i].compareTo(drinks[i + 1]) == 1)
                maxStrength = drinks[i];
            if (drinks[i].compareTo(drinks[i + 1]) == 0)
                maxStrength = drinks[i];
            if (drinks[i].compareTo(drinks[i + 1]) == -1)
                maxStrength = drinks[i];
            System.out.println(maxStrength);

        }
        for (int c = 0; c < drinks.length; c++) {
            strengths[drinks[c].getIng1.getstrength - 1]++;
        }
        return strengths;

    }
}
