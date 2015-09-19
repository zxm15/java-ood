package CallCenter;

import java.util.List;

/**
 * Created by zxm on 9/19/15.
 */
public class Director extends Employee {
    private List<String> questions;
    public Director(int employeeID) {
        super(employeeID);
        setRank(Rank.DIRECTOR);
        trainEmployee(questions);
    }

}
