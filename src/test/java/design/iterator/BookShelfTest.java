package design.iterator;

import java.util.Iterator;

import org.junit.Test;

import design.interator.model.Book;
import design.interator.model.BookShelf;

public class BookShelfTest {

    private final int testShelfSize = 100;

    @Test
    public void iterate() {
        BookShelf shelf = new BookShelf(testShelfSize);
        shelf.putBook(new Book("物理"));
        shelf.putBook(new Book("化学"));
        shelf.putBook(new Book("生物"));
        
        Iterator iterator = shelf.iterator();

        while (iterator.hasNext()) {
            Book currentBook = (Book) iterator.next();
            System.out.println(currentBook.getName());
        }
    }
}
