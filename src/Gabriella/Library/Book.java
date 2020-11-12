package Gabriella.Library;
import java.util.*;
public class Book {

    int bookId;
    String title;
    String  author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        allBooksInLibrary.add(this);

        Library.getBookInLibrary(this);
    }



    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
