import java.util.Scanner;

public class Kennel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        int avgAge;

        System.out.println("Input the first dog's name and age.(With a space between them.)");
        dog1.setDog(scan.next());
        dog1.setAge(scan.nextInt());

        System.out.println("Input the second dog's name and age.(With a space between them.)");
        dog2.setDog(scan.next());
        dog2.setAge(scan.nextInt());

        dog1.toPersonYears();
        dog2.toPersonYears();

        avgAge = (dog1.getAge() + dog2.getAge()) / 2;

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("The average person age of the dogs is " + avgAge);

        scan.close();
    }
}
