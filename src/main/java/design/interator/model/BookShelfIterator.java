package design.interator.model;

import java.util.Iterator;

// 迭代器模式: 遍历逻辑和数据结构实现的解耦
// 迭代器实现
public class BookShelfIterator implements Iterator {
    private int index;

    private BookShelf shelf;

    public BookShelfIterator(BookShelf shelf) {
        this.shelf = shelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.index < shelf.getSize()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        try {
            return shelf.getBook(this.index++);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
