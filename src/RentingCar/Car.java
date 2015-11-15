package RentingCar;

import java.util.Date;

/**
 * Created by zxm on 11/13/15.
 */
public class Car {
    private int id;
    private CarType carType;
    private CarStatus carStatus;
    private double price;
    private boolean isAvaiable;
    private Date avaiableDate;

    public int getId() {
        return id;
    }

    public CarType getCarType() {
        return carType;
    }

    public CarStatus getCarStatus() {
        return carStatus;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvaiable() {
        return isAvaiable;
    }

    public Date getAvaiableDate() {
        return avaiableDate;
    }
}
