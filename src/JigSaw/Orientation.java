package JigSaw;

/**
 * Created by ZXM on 11/11/15.
 */
public enum Orientation {
    LEFT, TOP, RIGHT, BOTTOM; //should stay in this order;

    public Orientation getOppsite() {
        switch(this) {
            case LEFT: return RIGHT;
            case RIGHT: return LEFT;
            case TOP: return BOTTOM;
            case BOTTOM: return TOP;
            default: return null;
        }
    }
}
