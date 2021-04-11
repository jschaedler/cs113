import java.util.Scanner;

public class Practice2B {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Practice2A[] circleArray = new Practice2A[50];
        int count = 0;
        for (int i = 0; i < 50; i++) {

            System.out.println("Type two integer cordinates separated by a space: ");
            Point tempPoint = new Point(scan.nextInt(), scan.nextInt());
            System.out.println("Type a floating point radius: ");
            float tempRadius = scan.nextFloat();
            Practice2A tempCircle = new Practice2A(tempRadius, tempPoint);
            Point origin = new Point(0, 0);
            if (tempCircle.getPoint().distance(origin) == tempRadius)
                count++;
            circleArray[i] = tempCircle;
        }

        System.out.println("The number of circles with origin on circumfrence: " + count);

        scan.close();

    }
}
