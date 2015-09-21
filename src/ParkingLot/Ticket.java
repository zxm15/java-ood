package ParkingLot;

import java.util.Timer;

/**
 * Created by ZXM on 9/16/15.
 */
public class Ticket {
    private int ticketID;
    private Timer time;
    //private int vehicleID;
    private Vehicle vehicle;
    private double payment;



    public Ticket(int ticketID, Timer time, Vehicle vehicle) {
        this.ticketID = ticketID;
        this.time = time;
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Timer getTime() {

        return time;
    }

    public int getTicketID() {
        return ticketID;
    }
}
