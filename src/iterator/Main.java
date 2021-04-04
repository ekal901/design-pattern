package iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4); // 책꽂이 자리 4개
        bookShelf.appendBook(new Book("아몬드")); // 책 꽂아넣음
        bookShelf.appendBook(new Book("유성의연인"));
        bookShelf.appendBook(new Book("부자 아빠 가난한 아빠"));
        bookShelf.appendBook(new Book("킬링이브"));

        // 책 제목 뽑기
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            Book book = (Book) iterator.next(); // iterator.next가 object 라서 casting
            System.out.println(book.getName());
        }
    }
}
