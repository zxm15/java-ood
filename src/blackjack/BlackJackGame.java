package blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZXM on 9/12/15.
 */
public class BlackJackGame extends Game <BlackJackCard, BlackJackHand> {
    /**
     * Instantiate a black jack game with some deck of cards and players
     * @param numOfDecks
     * @param numOfHands
     */
    public BlackJackGame(int numOfDecks, int numOfHands) {
        super(numOfDecks, numOfHands, "blackjack");
    }

    /**
     * Start a game with deal two cards to each player;
     * ask each player if they need another card;
     * show cards to find out the winner
     * @return The winner
     */
    public BlackJackHand playGame() {
        dealInitialCards();
        //ask if there is a hand need extra cards
        for (BlackJackHand hand : hands) {
            while (hand.wantAnotherCard()) {
                dealHand(hand);
            }
        }
        List<BlackJackHand> winners = winner();
        if (winners.size() == 1) return winners.get(0);
        return null;
    }

    /**
     * Supported methods to deal two cards to each player
     */
    private void dealInitialCards() {
        for (int i = 0; i < 2; i++) {
            for (BlackJackHand hand : hands) {
                dealHand(hand);
            }
        }
    }

    /**
     * Determine the winner of a game. We assume there could only be one winner.
     * @return
     */
    @Override
    public List<BlackJackHand> winner() {
        List<BlackJackHand> res = new ArrayList<BlackJackHand>();
        List<Integer> scores = new ArrayList<Integer>();
        int maxScore = 0;
        for (BlackJackHand hand : hands) {
            int score = hand.score();
            scores.add(score);
            if (maxScore < score) {
                maxScore = score;
            }
        }

        for (int i = 0; i < hands.size(); i++) {
            if (maxScore == scores.get(i)) {
                res.add(hands.get(i));
            }
        }

        return res;
    }


}
