package MineSweeper;

/**
 * Created by ZXM on 11/18/15.
 */
public class Cell {
    private int value; //numeric has positive values, blank == 0, bomb == -1
    private String face;
    private boolean hasFlag;

    public boolean isBomb() {
        return value == -1;
    }

    public boolean isVisited() {
        return !face.equals(Game.initalFaceMark);
    }

    public boolean isNumber() {
        return value > 0;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setHasFlag(boolean hasFlag) {
        this.hasFlag = hasFlag;
    }

    public int getValue() {
        return value;
    }

    public String getFace() {
        return face;
    }

    public boolean isHasFlag() {
        return hasFlag;
    }
}
