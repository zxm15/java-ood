package Payment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

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


    public synchronized double getBalance() {

        return balance;
    }


    public synchronized void changeBalance(double amount) {
        try {
            if (balance + amount < 0) {
                throw new IllegalArgumentException("You do not have enough balance");
            } else balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
