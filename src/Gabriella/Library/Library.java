package Gabriella.Library;
import java.util.*;


public class Library {

    String nameOfLibrary;
    ArrayList<Book> allBooksInLibrary = new ArrayList<>();



    public Library(String nameOfLibrary, ArrayList<Book> allBooksInLibrary) {
        this.nameOfLibrary = nameOfLibrary;
        this.allBooksInLibrary = allBooksInLibrary;
    }

    public void getBookInLibrary(Book obj){
        this.allBooksInLibrary.add(obj);
    }



    @Override
    public String toString() {
        return "Library{" +
                "nameOfLibrary='" + nameOfLibrary + '\'' +
                ", allBooksInLibrary=" + allBooksInLibrary +
                '}';
    }
}
