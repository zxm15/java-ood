package CallCenter;

import java.util.List;

/**
 * Created by zxm on 9/19/15.
 */
public class Manager extends Employee {
    private List<String> questions;
    public Manager(int employeeID) {
        super(employeeID);
        setRank(Rank.MANAGER);
        trainEmployee(questions);
    }
}
