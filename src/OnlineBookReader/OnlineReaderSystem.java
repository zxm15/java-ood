package OnlineBookReader;

/**
 * Created by zxm on 10/6/15.
 */
public class OnlineReaderSystem {
    private UserManagement users;
    private Library library;

    public OnlineReaderSystem(UserManagement users, Library library) {
        this.users = users;
        this.library = library;
    }
    //user services
    public boolean register(User user) {
        return users.register(user);
    }

    public boolean signIn(User user) {

    }

    public boolean signOut(User user) {

    }

    public boolean unregister(User user) {

    }

    //book service
    public void searchBook(Book book) {

    }

    public boolean requireBook(User user, Book book) {

    }

    public boolean returnBook(User user, Book book) {

    }



}
