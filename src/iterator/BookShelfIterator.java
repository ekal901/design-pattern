package iterator;

/**
 * Iterator 의 기능을 사용하기 위해, Iterator implements 해서 hasNext와 Next 구현
 * BookShelf 를 iterate 하였다.
 *
 */

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
