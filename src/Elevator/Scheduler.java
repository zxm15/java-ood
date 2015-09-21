package Elevator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ZXM on 9/17/15.
 */
public class Scheduler {
    private final int numOfElevators = 3;
    private Elevator[] elevators;
    private Queue<Request> requestQueue;
    private Queue<Elevator> availableElevators;
    protected Scheduler _instance;

    private Scheduler() {
        availableElevators = new LinkedList<Elevator>();
        requestQueue = new LinkedList<Request>();
        elevators = new Elevator[numOfElevators];
    }

    public Scheduler get_instance() {
        if (_instance == null) {
            _instance = new Scheduler();
        }

        return _instance;
    }

    public void receiveRequest(Request request) {
        requestQueue.offer(request);
    }

    /**
     * This is a very stupid scheduling mechanism
     * @return
     */
    public boolean assignRequestToElevator() {
        if (! requestQueue.isEmpty() && ! availableElevators.isEmpty()) {
            Elevator elevator = availableElevators.poll();
            Request request = requestQueue.poll();
            elevator.receiveRequest(request);
            return true;
        }

        return false;
    }




}
