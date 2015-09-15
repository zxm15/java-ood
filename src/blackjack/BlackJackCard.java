package blackjack;

/**
 * Created by ZXM on 9/12/15.
 */
public class BlackJackCard extends Card {
    /**
     *
     * @param suit
     * @param faceValue
     */
    public BlackJackCard(Suit suit, int faceValue) {
        super(suit, faceValue);
    }

    public int getMaxValue() {
        if (isAce()) return 11;
        return getValue();
    }

    public int getMinValue() {
        if (isAce()) return 1;
        return getValue();
    }

    @Override
    public int getValue() {
        if (isAce()) return 1;
        if (isFaceCard()) return 10;
        return getFaceValue();
    }

    public boolean isAce() {
        return getFaceValue() == 1;
    }

    public boolean isFaceCard() {
        return getFaceValue() >= 11 && getValue() <= 13;
    }



}
