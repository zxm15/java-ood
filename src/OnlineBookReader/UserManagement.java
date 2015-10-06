package OnlineBookReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zxm on 10/6/15.
 */
public class UserManagement {
    private List<User> users;
    private Map<User, Boolean> activeUsers;

    public UserManagement() {
        users = new ArrayList<>();
        activeUsers = new HashMap<>();
    }

    public boolean register(User user) {

    }

    public boolean unregister(User user) {

    }

    public boolean signIn(User user) {

    }

    public boolean signOut(User user) {

    }
}
