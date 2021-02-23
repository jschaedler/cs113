public class TravelKitTest {

    public static void main(String[] args) {

        TravelKit kit1 = new TravelKit(new Shampoo("Dove", 5), new Toothpaste());
        kit1.setToothpaste(6);
        TravelKit kit2 = new TravelKit(new Shampoo("Head and Shoulders", 18), new Toothpaste());
        kit2.setToothpaste(4);

        double avgToothWeight = (kit1.getShampoo().getWeight() + kit2.getShampoo().getWeight()) / 2;

        System.out.println("In the first kit " + kit1);
        System.out.println("In the second kit " + kit2);
        System.out.println("The average shampoo weight is " + avgToothWeight);

    }

}
