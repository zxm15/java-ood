package Elevator;

/**
 * Created by ZXM on 9/17/15.
 */
public class Elevator {
    private final int maxWeight = 2000;
    private Direction currDirection;
    private ElevatorStatus status;
    private int floor;

    /**
     * Elevator receive a request and go to that floor. Need a list of requests
     * @param request
     */
    public void addRequest(Request request) {

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
    
    //Getters and Setters

    public int getMaxWeight() {
        return maxWeight;
    }

    public Direction getCurrDirection() {
        return currDirection;
    }

    public void setCurrDirection(Direction currDirection) {
        this.currDirection = currDirection;
    }

    public ElevatorStatus getStatus() {
        return status;
    }

    public void setStatus(ElevatorStatus status) {
        this.status = status;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
