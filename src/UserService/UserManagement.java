package UserService;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by ZXM on 11/11/15.
 */
public class UserManagement {
    private Map<String, User> users; //email => user
    //private Set<String> emails;

    public UserManagement() {
        users = new HashMap<>();
    }

    public boolean register(String name, String email, String password) {
        if (users.containsKey(email)) return false;
        int id = users.size();
        User user = new User(id, name, email, Status.ACTIVE, password);
        users.put(email, user);

        return true;
    }

    /**
     * Store the information for 60 days before it was permenantly deleted
     * @param email
     * @return
     */
    public boolean unregister(String email) {
        User user = users.get(email);
        if (user.getStatus() != Status.ACTIVE) return false;
        user.setStatus(Status.INACTIVE);
        Date date = new Date();
        user.setLastLoginTime(new Timestamp(date.getTime()));

        return true;
    }

    public void deleteUser(String email) {
        User user = users.get(email);
        users.remove(user.getEmail());
    }

    public void login(String email, String password) {

        if (! users.containsKey(email))
            throw new IllegalArgumentException("The account does not exist");
        User user = users.get(email);
        if (! user.getPassword().equals(password))
            throw new IllegalArgumentException("Your password is not correct");

        user.setStatus(Status.ACTIVE);
        Date date = new Date();
        user.setLastLoginTime(new Timestamp(date.getTime()));
    }

    public void logout(String email) {
        User user = users.get(email);
        user.setStatus(Status.INACTIVE);
    }


    

}
