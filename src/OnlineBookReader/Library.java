package OnlineBookReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxm on 10/6/15.
 */
public class Library {
    private Map<Integer, Book> bookMap;
    private Map<Book, User> userBookMap;
    public Library() {
        bookMap = new HashMap<>();
    }

    public Book getBook(int bookID) {
        if (bookMap.containsKey(bookID)) return bookMap.get(bookID);
        return null;
    }

    public boolean borrowBook(User user, int bookID) {
        Book book = getBook(bookID);
        if (userBookMap.containsKey(book)) return false;
        userBookMap.put(book, user);

        return true;

    }

    public void returnBook(User user, int bookID) {
        Book book = getBook(bookID);
        userBookMap.remove(book);
    }


}
