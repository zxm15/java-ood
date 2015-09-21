package CallCenter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zxm on 9/19/15.
 */
public abstract class Employee {
    private int employeeID;
    private Rank rank;
    private boolean isAvailable = false;
    private Set<String> questionSet = new HashSet<>();
    public Employee(int employeeID) {
        this.employeeID = employeeID;

    }
//
//    public Employee(int employeeID, Rank rank) {
//        this.employeeID = employeeID;
//        this.rank = rank;
//    }

    public Rank getRank() {
        return rank;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getRankNumber() {
        return rank.getRank();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setEmployeeID(int employeeID) {

        this.employeeID = employeeID;
    }

    public void handleCall(Call call) {
        if (canAnswerQuestions(call.getCustomer().getQuesiton())) {
            finishCall(call);
        } else {
            escalateCall(call);
        }
    }

    public void finishCall(Call call) {

    }

    public void escalateCall(Call call) {
        
    }

    public boolean canAnswerQuestions(String question) {
        return questionSet.contains(question);
    }

    protected void trainEmployee(List<String> questions) {
        for (String question : questions) {
            questionSet.add(question);
        }

    }


}
