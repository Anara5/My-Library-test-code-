import java.math.MathContext;
import java.util.concurrent.Callable;

public class Book {

    public Writer writer;
    public String bookName;
    public int pages;

    public static int maxPages = 0; // for checking max amount of pages

    public static String book = null; //TODO for printing out a book name with maximum pages

    public Book(Writer writer, String bookName, int pages) { //constructor with writer name from Writer class
        this.writer = writer;
        this.bookName = bookName;
        this.pages = pages;
        maxPages = Math.max(maxPages, pages);

    }

    @Override
    public String toString() { // to print out all books in our library
        return writer + ", book: " + bookName +  ", pages: " + pages;
    }

    public static String bookPages() { // to show a book with maximum pages
        return maxPages + " pages is maximum that has a book which name is: "; //TODO
    }
}
