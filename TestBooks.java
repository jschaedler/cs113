import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestBooks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many books have you read?");
        int num = scan.nextInt();
        int numBooks = num;
        List<Book> books = new ArrayList<Book>();

        while (num > 0) {
            System.out.println("Type the title and number of pages of a book: ");
            String newTitle = scan.next();
            int newPages = scan.nextInt();
            books.add(new Book(newPages, newTitle));
            num--;
        }

        /**
         * if (books.get(0).compareTo(books.get(1)) == -1 &
         * books.get(0).compareTo(books.get(2)) == -1) { System.out.println("The
         * smallest book is: \n" + books.get(0)); } else { if
         * (books.get(1).compareTo(books.get(0)) == -1 &
         * books.get(1).compareTo(books.get(2)) == -1) {
         * System.out.println(books.get(1)); }
         * 
         * else { if (books.get(2).compareTo(books.get(0)) == -1 &
         * books.get(2).compareTo(books.get(1)) == -1) {
         * System.out.println(books.get(2)); } else System.out.println(); } }
         */

        Book minBook = books.stream().min(Comparator.comparing(Book::getPages)).orElseThrow();

        System.out.println("The book with the smallest number of pages is " + minBook.getTitle() + "with "
                + minBook.getPages() + " pages.");

        int length = books.size();
        int i = 0;
        int allBooks = 0;

        while (i < length) {

            int thisBook = books.get(length - 1).getPages();
            allBooks = thisBook + allBooks;
            length--;
        }

        float avgPages = (allBooks) / books.size();
        System.out.println("The average number of pages for the " + numBooks + " books is : " + avgPages);
        scan.close();

    }

}
