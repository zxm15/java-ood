package Elevator;

/**
 * Created by ZXM on 9/17/15.
 */
public class Request {
    private final int numOfFloors = 40;
    private int floor;
    private Direction direction;

    public int getFloor() {
        return floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Request(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public boolean isValid() {
        if (direction.equals("STILL")) return false;
        if (floor > numOfFloors || floor < 1) return false;
        return true;
    }
}
