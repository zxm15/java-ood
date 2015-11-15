package RentingCar;

import java.util.Date;

/**
 * Created by zxm on 11/13/15.
 */
public class Reservation {

    private int id;
    private Car car;
    private User user;
    private Date startDate;
    private Date endDate;

    public Reservation(int id, Car car, User user, Date startDate, Date endDate) {
        this.id = id;
        this.car = car;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
