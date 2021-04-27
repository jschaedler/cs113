import java.text.DecimalFormat;

public class PaintThings {

    public static void main(String[] args) {

        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        shape deck = new Rectangle(25.0, 35.0);
        shape bigBall = new Sphere(15.0);
        shape tank = new Cylinder(10.0, 30.0);

        double deckAmt, ballAmt, tankAmt;
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}