package Elevator;

/**
 * Created by ZXM on 9/17/15.
 */
public class Elevator {
    private Panel panel;
    private final int maxWeight = 2000;
    private Direction currDirection;
    private int floor;
    private ElevatorStatus status;

    /**
     * Elevator receive a request and go to that floor.
     * @param request
     */
    public void receiveRequest(Request request) {


    }

    /**
     * Impelment a logic that determines if the elevator could open door now
     * @return
     */
    public boolean openDoor() {
        return false;
    }

    /**
     * Implement a logic that determines i the elevator could close door now
     * @return
     */
    public boolean closeDoor() {
        return false;
    }
}
