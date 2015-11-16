package RequestDispatcher;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ZXM on 11/13/15.
 */
public class Dispatcher implements Subject {

    BlockingQueue<Request> queue = new ArrayBlockingQueue<>(100);

    public Dispatcher() {
    }

    public void addRequest(Request request) {
        queue.offer(request);
    }

    public void dispatchRequest(Request request, MapService mapService) {
        Location location = request.getLocation();
        List<Driver> drivers = mapService.getDriversAroundLocaiton(location);
        //sendRequest(drivers, request);

        while (true) {
            for (Driver driver : drivers) {
                if (driver.answerRequest(request)) {
                    request.setDriver(driver);
                    request.setRequestStatus(RequestStatus.ONGING);
                    break;
                }
            }
        }
        //sendConfirmation(request.getUser());

    }

//    public void sendRequest(List<Driver> drivers, Request request) {
//
//
//    }

    private void sendConfirmation(User user) {

    }

    public void register(Request request){

    }

    public void unregister(Request request) {

    }
    public void sendRequest(Observer observer, Request request) {

    }


}
