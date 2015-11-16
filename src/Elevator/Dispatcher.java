package Elevator;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by ZXM on 11/15/15.
 */
public class Dispatcher {
    BlockingQueue<Integer> taskQueue;
    BlockingQueue<Elevator> avaialbleElevatorQueue;
//    private final int FLOOR = 100;
//    private final int numberOfElevator = 8;

    public Dispatcher() {
        taskQueue = new ArrayBlockingQueue<>(App.FLOOR);
        avaialbleElevatorQueue = new ArrayBlockingQueue<>(App.numberOfElevator);
    }

    public void putTask(int floor) {
        try {
            taskQueue.put(floor);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void takeTask(Elevator elevator) {

        try {
            int task = taskQueue.take();
            elevator.addFloor(task);
        } catch (InterruptedException e){
            e.printStackTrace();
        }


    }



}
