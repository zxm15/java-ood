package blackjack;

/**
 * Created by ZXM on 9/14/15.
 */
public class HandFactory {

    public Hand makeAHand(String gameType) {
        Hand hand = null;
        if (gameType.equals("blackjack")) {
            hand = new BlackJackHand();
        }

        return hand;
    }
}
