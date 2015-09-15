package blackjack;

/**
 * Created by ZXM on 9/14/15.
 */
public class CardFactory {
    public Card makeACard(Suit suit, int faceValue, String gameType) {
        Card card = null;
        if (gameType.equals("blackjack")) {
            card = new BlackJackCard(suit, faceValue);
        }

        return card;
    }
}
