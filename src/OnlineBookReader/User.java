package OnlineBookReader;

/**
 * Created by zxm on 10/6/15.
 */
public class User {
    private int id;
    private String username;
    private String password;

    private Reader reader;

    public User() {
        reader = new Reader();
    }
    //user service
    public boolean signIn() {

    }

    public boolean signOut() {

    }

    public boolean unregister() {

    }

    //book service
    public boolean searchBook(int bookID) {

    }

    public boolean borrowBook(int bookID) {

    }

    public boolean returnBook(int bookID) {

    }

    //book reading service

    public void readBook() {

    }

    public void closeBook() {

    }

    public boolean nextPage() {

    }

    public boolean previousPage() {

    }

    public boolean gotoPage(int pageNumber) {

    }


}
