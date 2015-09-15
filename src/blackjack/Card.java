package blackjack;

/**
 * Created by ZXM on 9/12/15.
 */
public abstract class Card {
    private Suit suit;
    private int faceValue;
    private boolean available = true;

    /**
     * Create a card
     * @param suit
     * @param faceValue
     */
    public Card(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public abstract int getValue();

    public Suit getSuit() {
        return suit;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public void setSuit(Suit suit) {

        this.suit = suit;
    }

    public int getFaceValue() {

        return faceValue;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}
