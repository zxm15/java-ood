package OnlineBookReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxm on 10/6/15.
 */
public class Library {
    private Map<Integer, Book> bookMap;

    public Library() {
        bookMap = new HashMap<>();
    }

    public Book getBook(int id) {
        if (bookMap.containsKey(id)) return bookMap.get(id);
        return null;
    }

    public boolean borrowBook(User user, Book book) {

    }

    public void returnBook(User user, Book book) {

    }


}
