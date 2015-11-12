package Payment;

/**
 * Created by ZXM on 11/11/15.
 */
public class Account {
    private int id;
    private double balance;

    public Account(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public double getBalance() {
        return balance;
    }


    public void changeBalance(double amount) {
       balance += amount;
    }
}
