package OldElevator;

/**
 * Created by ZXM on 9/17/15.
 */
public enum Direction {
    DOWN(0), UP(1), STILL(2);
    private int value;
    Direction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public boolean equals(Direction direction) {
        return this.value == direction.getValue();
    }
}
