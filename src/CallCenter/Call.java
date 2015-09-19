package CallCenter;

/**
 * Created by zxm on 9/19/15.
 */
public class Call {
    private int callID;
    private Customer customer;
    private Employee employee;
    private Rank rank;

    public Call(int callID, Customer customer) {
        this.callID = callID;
        this.customer = customer;
    }

    public int getRankNumber() {
        return rank.getRank();
    }

    public int getCallID() {
        return callID;
    }

    public void setCallID(int callID) {
        this.callID = callID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
