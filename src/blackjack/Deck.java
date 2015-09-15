package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by ZXM on 9/12/15.
 */
public class Deck <C extends Card> {
    private List<C> cards = new ArrayList<C>();
    private int dealtIndex;

    public Deck(String gameType) {
        //factory design pattern
        CardFactory cardFactory = new CardFactory();
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 13; i++) {
                cards.add((C) cardFactory.makeACard(suit, i, gameType));
            }
        }
        dealtIndex = 0;
    }

    public void addCard(C card) {
        cards.add(card);
    }

    public C getNextCard() {

        while (! cards.get(dealtIndex).isAvailable()) {
            dealtIndex++;
            if (dealtIndex >= cards.size()) throw new ArrayIndexOutOfBoundsException();

        }

        return cards.get(dealtIndex);
    }


    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cards.size(); i++) {
            int j = i + rand.nextInt(cards.size() - i);
            swap(cards, i, j);
        }

    }

    private void swap(List<C> list, int i, int j) {
        if (i != j) {
            C temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }

    }

    public void printDeck() {
        for (C card : cards) {
            System.out.print(card.getSuit());
            //System.out.print(" ");
            System.out.print(card.getFaceValue());
            System.out.print(" ");
        }
        System.out.println();
    }

    public int getDealtIndex() {
        return dealtIndex;
    }

    public List<C> getCards() {
        return cards;
    }
}
