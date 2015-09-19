package CallCenter;

/**
 * Created by zxm on 9/19/15.
 */
public enum Rank {
    RESPONDENT(0), MANAGER(1), DIRECTOR(2);
    private int rank;
    Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
