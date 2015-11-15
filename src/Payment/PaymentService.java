package Payment;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZXM on 11/11/15.
 */
public class PaymentService {


    public void transferMoney(Account sender, Account receiver, double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive");

        if (sender.getBalance() < amount)

        sender.changeBalance(-amount);
        receiver.changeBalance(amount);
    }
}
