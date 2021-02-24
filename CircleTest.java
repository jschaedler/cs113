import java.util.Random;
import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int xValue = rand.nextInt(10) + 1;
        int yValue = rand.nextInt(10) + 1;

        Point p1 = new Point(xValue, yValue);
        Point p2 = new Point(0, 0);

        System.out.println("Enter the radius for circle 1: ");
        float radius = scan.nextFloat();
        Circle circle1 = new Circle(p2, radius);
        Circle circle2 = new Circle(p1, (float) 5.5);

        double distance = circle1.getPoint().distance(circle2.getPoint());

        System.out.println("Summary for circle 1: \n" + circle1);
        System.out.println("Summary for circle 2: \n" + circle2);
        System.out.println("The distance between the two circles' centers is " + distance + " units");

        scan.close();

    }
}