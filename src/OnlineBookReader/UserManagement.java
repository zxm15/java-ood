package OnlineBookReader;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by zxm on 10/6/15.
 */
public class UserManagement {
    private Map<Integer, User> users;

    public UserManagement() {
        users = new HashMap<>();
    }

    public boolean register(int id, String username, String password) {
        if (users.containsKey(id)) return false;
        User user = new User(id, username, password);
        users.put(id, user);

        return true;
    }

    public void unregister(User user) {
        users.remove(user.getId());
    }

   
}
