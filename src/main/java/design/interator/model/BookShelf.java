package design.interator.model;

import java.util.Iterator;

// 书架
// 注意书架不能扩容
public class BookShelf implements Iterable {
    private Book[] books;

    private int size;

    public BookShelf(int size) {
        this.size = 0;
        this.books = new Book[size];
    }
    
    // todo: 构造方法, putBook, getBook
    public boolean putBook(Book book) {
        if (this.size < books.length) {
            books[this.size++] = book;
            return true;
        }
        return false;
    }

    public Book getBook(int index) throws Exception {
        if (index >= this.size) {
            throw new Exception("超过书柜大小");
        }
        return books[index];
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

}
