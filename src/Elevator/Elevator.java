package Elevator;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by ZXM on 9/17/15.
 */
public class Elevator {
    private final int maxWeight = 2000;
    private Direction currDirection;
    private ElevatorStatus status;
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private int floor;

    /**
     * Elevator add a request to task heap
     * @param floor
     */

    public void addRequest(int floor) {
        //check request moving direction aligns with elevators moving direction, if not, then

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
