package iterator;

/**
 * Iterator 의 구현을 위해 Aggregate 인터페이스 implements (집함의 개념 설정)
 * Iterator 를 implements 하면서 BookShelfIterator 를 사용
 *
 */
public class BookShelf implements Aggregate {
    private Book[] books; // 다른데서 변경 못하게 private
    private int last = 0;

    // 책꽂이 자리 갯수 고정!
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book; // 책정보 추가
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
