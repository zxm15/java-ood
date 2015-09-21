package CallCenter;

import java.util.List;

/**
 * Created by zxm on 9/19/15.
 */
public class Respondent extends Employee {
    private List<String> questions;
    public Respondent(int employeeID) {
        super(employeeID);
        setRank(Rank.RESPONDENT);
        trainEmployee(questions);
    }


}
