package com.company;


import blackjack.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BlackJackGame blackjack = new BlackJackGame(1,2);
        //print deck of cards
        for (Deck<BlackJackCard> deck : blackjack.getDecks()) {
            deck.shuffle();
            deck.printDeck();
        }
        //print players
        int i = 1;
        Map<BlackJackHand, String> playerMap = new HashMap<BlackJackHand, String>();
        for (BlackJackHand hand : blackjack.getHands()) {
            System.out.println("Player " + i);
            playerMap.put(hand, "Player" + i);
            i++;
        }
        //let us play some poker
       // BlackJackHand winner = blackjack.playGame();
        for (BlackJackHand hand : blackjack.getHands()) {
            hand.printCards();
            System.out.println("Player " + i + " score is " + hand.score());
            i++;
        }
       // System.out.println("Winner is " + playerMap.get(winner));


    }
}
