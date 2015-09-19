package CallCenter;

/**
 * Created by zxm on 9/19/15.
 */
public class Customer {

    private int cusotmerID;
    private String quesiton;

    public Customer(int cusotmerID, String question) {
        this.cusotmerID = cusotmerID;
        this.quesiton = question;
    }

    public int getCusotmerID() {
        return cusotmerID;
    }

    public void setCusotmerID(int cusotmerID) {
        this.cusotmerID = cusotmerID;
    }

    public String getQuesiton() {
        return quesiton;
    }

    public void setQuesiton(String quesiton) {
        this.quesiton = quesiton;
    }
}
