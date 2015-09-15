package blackjack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ZXM on 9/12/15.
 */
public class BlackJackHand extends Hand <BlackJackCard>{
    /**
     * Logic to determine if a player want another card
     * @return
     */
    @Override
    public boolean wantAnotherCard() {
        if (isBusted() || is21() || isBlackJack()) return false;
        int diff = 21 - score();
        if (diff > 5) return true;
        return false;
    }

    /**
     * Check all possible scores and return the max one that is under 21
     * or the min one over 21
     * @return
     */
    @Override
    public int score() {
        List<Integer> scores = possibleScores();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int score : scores) {
            if (max < score && score <= 21) {
                max = score;
            } else if (score > 21 && score < min) {
                min = score;
            }
        }

        return max == Integer.MIN_VALUE ? min : max;
    }

    private List<Integer> possibleScores() {
        return possibleScoresHelper(cards, 0);
    }

    private List<Integer> possibleScoresHelper(List<BlackJackCard> cards, int index) {
        Set<Integer> res = new HashSet<Integer>();
        if (index == cards.size()) {
            res.add(0);
            return new ArrayList<Integer>(res);
        }
        BlackJackCard curr = cards.get(index);
        int max = curr.getMaxValue();
        int min = curr.getMinValue();
        List<Integer> list = possibleScoresHelper(cards, index + 1);
        for (int i : list) {
            res.add(i + max);
            if (max != min) res.add(i + min);
        }

        return new ArrayList<Integer>(res);
    }

    public boolean isBusted() {
        return score() > 21;
    }

    public boolean is21() {
        return score() == 21;
    }

    public boolean isBlackJack() {
        return cards.size() == 2 && score() == 21;
    }
}
