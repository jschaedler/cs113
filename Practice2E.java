import java.util.Scanner;

public class Practice2E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of Students in the graduating class: ");

        Practice2D[] classArray = new Practice2D[scan.nextInt()];
        System.out.println("Enter the honor roll GPA: ");
        GPA targetGPA = new GPA(scan.nextDouble());
        int honorRollStudents = 0;

        for (int i = 0; i < classArray.length; i++) {
            System.out.println("Enter the name of student " + (i + 1));
            GPA tempGpa = new GPA(Math.random() * 4);
            Practice2D tempStudent = new Practice2D(scan.nextLine(), tempGpa);
            if (tempGpa.compareTo(targetGPA) >= 1)
                honorRollStudents++;
            classArray[i] = tempStudent;

        }

        System.out.println("Honor roll Students: " + honorRollStudents);

    }

}
