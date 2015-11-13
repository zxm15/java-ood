package RentingCar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by zxm on 11/13/15.
 */
public class RentalService {
    private List<Map<Integer, Car>> carMaps;
    private Map<Integer, Reservation> reservationMap;
    private Map<Integer, Order> orderMap;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public void addCar(Car car) {

    }


    public List<Car> findAvaiableCars(Date startDate, Date endDate) {
        List<Car> res = new ArrayList<>();
        Date date = new Date();
        if (startDate.before(date))
            throw new IllegalArgumentException("The start date cannot be earlier than today");
        if (startDate.after(endDate))
            throw new IllegalArgumentException("The end date must be larger than the start date");
        for (Map<Integer, Car> carMap : carMaps) {
            for (Car car : carMap.values()) {
                if (car.getAvaiableDate().before(startDate))
                    res.add(car);
            }
        }


        return res;
    }

//    private boolean isBefore(Date first, Date second) {
//
//    }

    public List<Car> findAvaibleCarsByType(Date startDate, Date endDate, CarType carType) {
        List<Car> res = new ArrayList<>();
        Date date = new Date();
        if (startDate.before(date))
            throw new IllegalArgumentException("The start date cannot be earlier than today");
        if (startDate.after(endDate))
            throw new IllegalArgumentException("The end date must be larger than the start date");
        Map<Integer, Car> carMap = carMaps.get(carType.getValue());
        for (Car car : carMap.values()) {
            if (car.getAvaiableDate().before(startDate))
                res.add(car);
        }

        return res;
    }

    public List<Car> findAvaibleCarsByPrice(Date startDate, Date endDate, double low, double high) {

        List<Car> res = new ArrayList<>();
        Date date = new Date();
        if (startDate.before(date))
            throw new IllegalArgumentException("The start date cannot be earlier than today");
        if (startDate.after(endDate))
            throw new IllegalArgumentException("The end date must be larger than the start date");
        for (Map<Integer, Car> carMap : carMaps) {
            for (Car car : carMap.values()) {
                if (car.getAvaiableDate().before(startDate) && car.getPrice() >= low && car.getPrice() <= high)
                    res.add(car);
            }
        }


        return res;

    }

    public double calRentalPrice(Car car, Date startDate, Date endDate) {
        int days = (int) getDateDiff(startDate, endDate, TimeUnit.DAYS);
        return car.getPrice() * days;
    }




    /**
     * Get a diff between two dates
     * @param date1 the oldest date
     * @param date2 the newest date
     * @param timeUnit the unit in which you want the diff
     * @return the diff value, in the provided unit
     */
    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
    public Reservation reserveCar(User user, Car car, Date startDate, Date endDate) {
        if (checkIfCarAvaiable(car ,startDate, endDate)) {
            int id = reservationMap.size();
            Reservation reservation = new  Reservation(id, car, user, startDate, endDate);
            reservationMap.put(id, reservation);
            return reservation;
        }

        return null;
    }

//    public boolean cancelReservation(Reservation reservation) {
//
//    }
//
//    public void pickUpCar(Reservation reservation) {
//
//    }
//
//    public void returnCar(Reservation reservation) {
//
//
//    }
//
//    public Order generateOrder(Reservation reservation) {
//
//    }

    private boolean checkIfCarAvaiable(Car car, Date startDate, Date endDate) {
        return car.getAvaiableDate().before(startDate);
    }


}
