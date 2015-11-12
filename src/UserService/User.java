package UserService;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ZXM on 11/11/15.
 */
public class User {
    private int id;
    private String name;
    private String password;
    private Status status;
    private String email;
    private Timestamp lastLoginTime;
    private List<Session> sessions;

    public User(int id, String name, String password, Status status, String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.status = status;
        this.email = email;
        sessions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Status getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getlastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
