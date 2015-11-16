package OldElevator;

/**
 * Created by ZXM on 9/17/15.
 */
public class User {
    private int weight;
    /**
     * Request an elevator to pick him up
     * @param floor
     * @param direction
     */
    public void requestElevator(int floor, Direction direction, Scheduler scheduler)  {
        scheduler.receiveRequest(new Request(floor, direction));
    }

    public boolean openDoor(Elevator elevator) {
        return elevator.openDoor();
    }

    public boolean closeDoor(Elevator elevator) {
        return elevator.closeDoor();
    }



}
