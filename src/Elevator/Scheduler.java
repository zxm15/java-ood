package Elevator;

import java.util.*;

/**
 * Created by ZXM on 9/17/15.
 */

public class Scheduler {
    private final int numOfFloors = 100;
    private final int numOfElevators = 3;
    private final int buffer = 1;
    private Elevator[] elevators;
    private Queue<Elevator> availableElevators;
    private boolean[] upRequests;
    private boolean[] downRequests;
    private int numOfUpRequests = 0;
    private int numOfDownRequests = 0;
    private int[] upRequestsFloorRange = new int[] {0, 0}; //first min, second max
    private int[] downRequestsFloorRange = new int[] {0, 0};
    private Queue<Elevator> upMovingElevators;
    private Queue<Elevator> downMoivingElevators;

    protected Scheduler _instance;

    private Scheduler() {
        //initialization
        elevators = new Elevator[numOfElevators];
        upRequests = new boolean[numOfFloors];
        downRequests = new boolean[numOfFloors];
        availableElevators = new LinkedList<>();
        for (int i = 0; i < numOfElevators; i++) {
            elevators[i] = new Elevator();
            availableElevators.offer(elevators[i]);
        }
        upMovingElevators = new LinkedList<>();
        downMoivingElevators = new LinkedList<>();

    }

    public Scheduler get_instance() {
        if (_instance == null) {
            _instance = new Scheduler();
        }

        return _instance;
    }

    /**
     * one thread receives requeset and mark the up and down reqeusts array
     * @param request
     */

    public void receiveRequest(Request request) {
        Direction direction = request.getDirection();
        switch(direction) {
            case UP:
                upRequests[request.getFloor()] = true;
                numOfUpRequests++;
                upRequestsFloorRange[0] = Math.min(upRequestsFloorRange[0], request.getFloor());
                upRequestsFloorRange[1] = Math.max(upRequestsFloorRange[1], request.getFloor());
                break;
            case DOWN:
                downRequests[request.getFloor()] = true;
                numOfDownRequests++;
                downRequestsFloorRange[0] = Math.min(downRequestsFloorRange[0], request.getFloor());
                downRequestsFloorRange[1] = Math.max(downRequestsFloorRange[1], request.getFloor());
                break;
            case STILL:
                break;
        }
    }
    /**
     * A thread assigns down requests to down moving elevators;
     * @return
     */
    public void assignDownRequest() {
        while (true) {
            //always listen to the state of down requests and down moving elevators
            while (numOfDownRequests > 0 && ! downMoivingElevators.isEmpty()) {
                Elevator elevator = downMoivingElevators.poll();
                int elevatorFloor = elevator.getFloor();
                if (elevatorFloor - downRequestsFloorRange[0] > buffer) {
                    for (int i = downRequestsFloorRange[0]; i <= elevatorFloor ; i++) {
                        if (downRequests[i]) {
                            elevator.addRequest(i);
                            downRequests[i] = false;
                            numOfDownRequests--;
                            if (i == downRequestsFloorRange[0]) {
                                downRequestsFloorRange[0] = numOfFloors + 100;
                            }
                            downRequestsFloorRange[0] = Math.min(downRequestsFloorRange[0], i);
                        }
                    }
                }
                downMoivingElevators.offer(elevator);
            }
        }
    }


//    private void assignRequestToElevatorHelper(List<Elevator> elevators, Request request) {
//        if (elevators == null || elevators.isEmpty()) throw new IllegalArgumentException("The elevator list is empty");
//        int size = elevators.size();
//        for (int i = 0; i < size; i++) {
//            Elevator elevator = elevators.get(i);
//            if (! elevator.getCurrDirection().equals(request.getDirection())) break;
//            int diff = request.getFloor() - elevator.getFloor();
//            if (diff > buffer) {
//                elevator.addRequest(request);
//                return;
//            }
//        }
//        Random rand = new Random();
//        elevators.get(rand.nextInt(size)).addRequest(request);
//    }




}
