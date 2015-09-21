package Elevator;

/**
 * Created by ZXM on 9/17/15.
 */
public class Request {
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
}
