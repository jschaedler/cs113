import java.util.*;

public class exam1Q12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Input Circle one's radius: ");
        int radius1 = scan.nextInt();
        int radius2 = (int) rand.nextInt(11) + 5;

        exam1Q11 circle1 = new exam1Q11(radius1);
        exam1Q11 circle2 = new exam1Q11(radius2);

        System.out.println("The area of circle one: " + circle1.area());
        System.out.println("THe area of circle  two: " + circle2.area());

        int newRadius2 = circle1.getRadius();
        int newRadius1 = circle2.getRadius();

        circle1.setRadius(newRadius1);
        circle2.setRadius(newRadius2);

        System.out.println(circle1);
        System.out.println(circle2);

        scan.close();

    }

}
