package Elevator;

import java.util.Queue;

/**
 * Created by ZXM on 11/15/15.
 */
public class Elevator implements Runnable{
    //for simplicity we just use a queue to store the tasks
    private Queue<Integer> floors;
    private final int MAXWEIGHT = 1400;
    private int weight;
    ElevatorStatus elevatorStatus;

    public void addFloor(int floor) {
        floors.add(floor);
    }

    public void gotoNextFloor() {
        gotoFloor(floors.poll());

    }

    private void gotoFloor(int floor){}

    public void openDoor() {


    }

    public void closeDoor() {

    }

    public void removeCurrentFloor() {
        floors.poll();
    }

    public boolean checkIfExceedWeightLimit() {
        return weight >= MAXWEIGHT;
    }

    public void run() {

    }



}
