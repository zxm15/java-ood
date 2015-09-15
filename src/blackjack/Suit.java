package blackjack;

/**
 * Created by ZXM on 9/12/15.
 */
public enum Suit {
    Club (0), Diamond (1), Heart(2), Spade(3);
    private int value;
    private Suit(int v) {
        value = v;
    }
    public int getValue() {
        return value;
    }


}

