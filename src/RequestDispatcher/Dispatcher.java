package RequestDispatcher;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ZXM on 11/13/15.
 */
public class Dispatcher {

    Queue<Request> queue;

    public Dispatcher() {
        queue = new LinkedList<>();
    }

    public void addRequest(Request request) {
        queue.offer(request);
    }

    public void dispatchRequest(Request request, MapService mapService) {
        Location location = request.getLocation();
        List<Driver> drivers = mapService.getDriversAroundLocaiton(location);
        sendRequest(drivers, request);

        while (true) {
            for (Driver driver : drivers) {
                if (driver.answerRequest(request)) {
                    request.setDriver(driver);
                    request.setRequestStatus(RequestStatus.ONGING);
                    break;
                }
            }
        }
        sendConfirmation(request.getUser());

    }

    private void sendRequest(List<Driver> drivers, Request request) {

    }

    private void sendConfirmation(User user) {

    }
}
