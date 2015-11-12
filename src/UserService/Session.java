package UserService;

import java.util.Date;

/**
 * Created by ZXM on 11/11/15.
 */
public class Session {
    private String id; //session id
    private AuthStatus authStatus;
    private Date expiration;
    private Device device;
}
