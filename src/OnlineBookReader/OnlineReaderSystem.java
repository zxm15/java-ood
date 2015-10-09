package OnlineBookReader;

/**
 * Created by zxm on 10/6/15.
 */
public class OnlineReaderSystem {
    private UserManagement users; //user service
    private Library library; //book service
    private Reader reader; //reading service

    public OnlineReaderSystem(UserManagement users, Library library, Reader reader) {
        this.users = users;
        this.library = library;
        this.reader = reader;
    }

    //Getters and Setters

    public UserManagement getUsers() {
        return users;
    }

    public void setUsers(UserManagement users) {
        this.users = users;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }
}
