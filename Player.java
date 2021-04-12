
import java.util.Scanner;

public class Player {
    private String name;
    private int goals;

    private int games;

    public Player() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter soccer player’sname: ");
        name = scan.nextLine();
        System.out.print("Enter " + name + "'s total goals scores: ");
        goals = scan.nextInt();
        System.out.print("Enter " + name + "'s total games played: ");
        games = scan.nextInt();
        scan.close();
    }

    public double getAverage() {
        return (goals == 0 ? 0 : goals / games);

    }
}
