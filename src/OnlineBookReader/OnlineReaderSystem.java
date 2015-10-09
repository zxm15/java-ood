package OnlineBookReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zxm on 10/6/15.
 */
public class OnlineReaderSystem {
    private UserManagement users; //user service
    private Library library; //book service
    private List<Reader> reader; //reading service

    public OnlineReaderSystem() {
        this.users = new UserManagement();
        this.library = new Library();
        this.reader = new ArrayList<>();
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

    
}
