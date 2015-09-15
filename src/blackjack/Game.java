package blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZXM on 9/12/15.
 */
public abstract class Game<C extends Card, H extends Hand> {
    protected List<Deck<C>> decks = new ArrayList<Deck<C>>(); //some game need more than one deck
    protected List<H> hands = new ArrayList<H>(); //players

    /**
     * create new players and decks and add them into lists
     * @param numOfDecks number of deck of cards needed in the game
     * @param numOfPlayers number of players in the game
     */
    public Game(int numOfDecks, int numOfPlayers, String gameType) {
        for (int i = 0; i < numOfDecks; i++) {
            decks.add(new Deck<C>(gameType));
        }
        //use factory design pattern to create a list of players in the game
        HandFactory factory = new HandFactory();
        for (int i = 0; i < numOfPlayers; i++) {
            hands.add((H) factory.makeAHand(gameType));
        }
    }

    /**
     * Deal a card to a player
     * @param hand  The player who wants a card
     */
    public void dealHand(H hand) {
        if (decks.isEmpty()) throw new IllegalArgumentException("No more cards available for the game");
        Deck curr = decks.get(0);
        C card = (C) curr.getNextCard();
        if (curr.getDealtIndex() == curr.getCards().size()) {
            decks.remove(0);
        }
        card.setAvailable(false);
        hand.receiveCard(card);
    }

    /**
     * Check the winner for the game
     * @return The winner
     */
    public abstract List<H> winner();

    /**
     * Add a new player into game
     * @param hand
     */
    public void addHand(H hand) {
        hands.add(hand);
    }

    /**
     * Remove a palyer from game
     * @param index
     * @return
     */
    public void removeHand(int index) {
        //assume we do not care about order of the players, swap to the last one and delete
        if (index >= hands.size()) throw new IllegalArgumentException();
        swap(hands, index, hands.size() - 1);
        hands.remove(hands.size() - 1);
    }

    private void swap(List<H> hands, int i, int j) {
        H temp = hands.get(i);
        hands.set(i, hands.get(j));
        hands.set(j, temp);
    }

    public List<Deck<C>> getDecks() {
        return decks;
    }

    public List<H> getHands() {
        return hands;
    }
}
