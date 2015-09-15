package blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZXM on 9/12/15.
 */
public abstract class Hand <C extends Card> {
    protected List<C> cards = new ArrayList<C>();

    public void receiveCard(C card) {
        cards.add(card);
    }

    public abstract int score();
    public abstract boolean wantAnotherCard();

    public void printCards() {
        for (C card : cards) {
            System.out.print(card.getSuit());
            //System.out.print(" ");
            System.out.print(card.getFaceValue());
            System.out.print(" ");
        }
        System.out.println();
    }

}
