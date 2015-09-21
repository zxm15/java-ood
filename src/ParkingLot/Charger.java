package ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/**
 * Created by ZXM on 9/16/15.
 */
public class Charger {
    private List<Ticket> ticketList;
    private int amount;
    private int unPaidTicket;

    public Charger(List<Ticket> ticketList) {
        this.ticketList = new ArrayList<>();
        amount = 0;
        unPaidTicket = 0;
    }
    public void chargeParkingFee(Ticket ticket, Timer time) {
        double price = calculateParkingFee(ticket, time);
        Driver driver = ticket.getVehicle().getDriver();
        double paid = 0;
        while(price > paid) {
            //counting the time, set expiration time out 5 mins
            paid += driver.makePayment();
        }
        receivePayment(paid);
        if (price < paid) {
            makeChange(-1 * (paid - price));
        }

        raiseBar();
        //wait for 10 second
        lowerBar();

    }

    public void receivePayment(double payment) {
        amount += payment;
    }
    public double calculateParkingFee(Ticket ticket, Timer current) {
        return 0;
    }

    public void makeChange(double change) {
        amount -= change;
    }

    public void raiseBar() {

    }

    public void lowerBar() {

    }
    public int getAmount() {
        return amount;
    }

    public int getUnPaidTicket() {
        return unPaidTicket;
    }
}
