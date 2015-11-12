package Payment;

/**
 * Created by ZXM on 11/11/15.
 */
public class PaymentService {


    public synchronized void transferMoney(Account sender, Account receiver, double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive");
        if (sender.getBalance() < amount)
            throw new IllegalArgumentException("You do not have enough balance");
        sender.changeBalance(-amount);
        receiver.changeBalance(amount);
    }
}
