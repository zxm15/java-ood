package ParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZXM on 9/16/15.
 */
public class Floor {
    private List<Lot[]> lots = new ArrayList<Lot[]>();
    private final static int[] numOfLots = new int[] {20,100,10};
    private int[] remainingLots = new int[numOfLots.length];

    public Floor() {
        //assign lots to each list
    }

    public int[] findAvailableLot() {
        //iterate through all lots in the list, accumulate value;
        //another way, keep tracking of the remaing lot we have for each v type O(1) time
        return remainingLots;
    }

    public boolean parkVehicle(Vehicle vehicle, Lot lot) {
        if (lot.canFitVehicle(vehicle) && lot.isAvailable()) {
            lot.setIsAvailable(false);
            return true;
        }

        return false;
    }

    //private boolean canFitVehicle(Vehicle vehicle, Lot lot)
}
