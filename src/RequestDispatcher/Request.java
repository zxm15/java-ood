package RequestDispatcher;

/**
 * Created by ZXM on 11/13/15.
 */
public class Request {
    private User user;
    private Driver driver;
    private RequestStatus requestStatus;
    private Location location;

    public Request(User user, Location location) {
        this.user = user;
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public Driver getDriver() {
        return driver;
    }

    public RequestStatus getRequestStatus() {
        return requestStatus;
    }

    public Location getLocation() {
        return location;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setRequestStatus(RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }
}
