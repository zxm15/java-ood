package Elevator;

import java.util.*;

/**
 * Created by ZXM on 9/17/15.
 */
public class Scheduler {
    private final int numOfElevators = 3;
    private final int buffer = 1;
    private Elevator[] elevators;
    private Queue<Elevator> availableElevators;
    private List<Elevator> upMovingElevators;
    private List<Elevator> downMoivingElevators;
    protected Scheduler _instance;

    private Scheduler() {
        elevators = new Elevator[numOfElevators];
        availableElevators = new LinkedList<>();
        for (int i = 0; i < numOfElevators; i++) {
            elevators[i] = new Elevator();
            availableElevators.offer(elevators[i]);
        }
        upMovingElevators = new ArrayList<>();
        downMoivingElevators = new ArrayList<>();

    }

    public Scheduler get_instance() {
        if (_instance == null) {
            _instance = new Scheduler();
        }

        return _instance;
    }


    /**
     * Find a proper elevator to receive a request
     * @return
     */
    public boolean assignRequestToElevator(Request request) {
        if (request == null || ! request.isValid()) return false;
        if (! availableElevators.isEmpty()) {
            availableElevators.poll().addRequest(request);
            return true;
        }
        Direction direction = request.getDirection();
        switch (direction) {
            case UP:
                if (upMovingElevators.isEmpty()) {
                    assignRequestToElevatorHelper(downMoivingElevators, request);
                } else {
                    assignRequestToElevatorHelper(upMovingElevators, request);
                }
            case DOWN:
                if (downMoivingElevators.isEmpty()) {
                    assignRequestToElevatorHelper(upMovingElevators, request);
                } else {
                    assignRequestToElevatorHelper(downMoivingElevators, request);
                }
            case STILL:
                break;
        }

        return true;
    }

    private void assignRequestToElevatorHelper(List<Elevator> elevators, Request request) {
        if (elevators == null || elevators.isEmpty()) throw new IllegalArgumentException("The elevator list is empty");
        int size = elevators.size();
        for (int i = 0; i < size; i++) {
            Elevator elevator = elevators.get(i);
            if (! elevator.getCurrDirection().equals(request.getDirection())) break;
            int diff = request.getFloor() - elevator.getFloor();
            if (diff > buffer) {
                elevator.addRequest(request);
                return;
            }
        }
        Random rand = new Random();
        elevators.get(rand.nextInt(size)).addRequest(request);
    }




}
