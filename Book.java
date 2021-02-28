
public class Book {

    private int pages;
    private String title;

    public Book(int pages, String title) {
        this.pages = pages;
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void setPages(int newPages) {
        pages = newPages;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String toString() {
        String info = "Book title: " + title + "\nNumber of Pages: " + pages;
        return info;
    }

    public boolean equals(Book b2) {
        if (b2.getPages() == pages & b2.getTitle() == title)
            return true;
        else
            return false;
    }

    public int compareTo(Book b2) {
        if (b2.getPages() > pages)
            return -1;
        else if (b2.getPages() == pages)
            return 0;
        else
            return 1;
    }

}
