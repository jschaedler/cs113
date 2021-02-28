import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBooks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 3;
        List<Book> books = new ArrayList<Book>();

        while (num > 0) {
            System.out.println("Type the title and number of pages of a book: ");
            String newTitle = scan.next();
            int newPages = scan.nextInt();
            books.add(new Book(newPages, newTitle));
            num--;
        }

        if (books.get(0).compareTo(books.get(1)) == -1 & books.get(0).compareTo(books.get(2)) == -1) {
            System.out.println("The smallest book is: \n" + books.get(0));
        } else {
            if (books.get(1).compareTo(books.get(0)) == -1 & books.get(1).compareTo(books.get(2)) == -1) {
                System.out.println(books.get(1));
            }

            else {
                if (books.get(2).compareTo(books.get(0)) == -1 & books.get(2).compareTo(books.get(1)) == -1) {
                    System.out.println(books.get(2));
                } else
                    System.out.println();
            }

        }
        int length = books.size();
        double avgPages = (books.get(0).getPages() + books.get(1).getPages() + books.get(2).getPages()) / length;

        System.out.println("The average number of pages for " + length + " books is : " + avgPages);

        scan.close();

    }

}
