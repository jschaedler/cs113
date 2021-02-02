import java.util.Scanner;

public class cs113Paint {
    // Purpose: Determine how much paint is needed to paint the walls
    // of a room given its length, width, and height
    // *************************************************************** import
    // java.util.Scanner;public class Paint {
    public static void main(String[] args) {
        final int COVERAGE = 350; // paint covers 350 sq ft/gal
        int length, width, height, doors, windows; // declare integers length, width, and height;
        double totalSqFt, paintNeeded;// declare double totalSqFt// declare double paintNeeded;

        Scanner scan = new Scanner(System.in);// declare and initialize Scanner object
        System.out.print("Enter length of room: "); // Prompt for and read in the length of the room
        length = scan.nextInt();

        System.out.print("Enter width of room: ");
        width = scan.nextInt();

        System.out.print("Enter height of room: ");
        height = scan.nextInt();

        System.out.print("Enter number of doors: ");
        doors = scan.nextInt();
        doors *= 20;

        System.out.print("Enter number of windows: ");
        windows = scan.nextInt();
        windows *= 15;

        totalSqFt = (2 * (length * height) + 2 * (width * height)) - (windows + doors);
        paintNeeded = totalSqFt / COVERAGE;
        System.out.println(
                "length: " + length + "width: " + width + "height: " + height + "number of gallons" + paintNeeded);
        scan.close();
    }

}
