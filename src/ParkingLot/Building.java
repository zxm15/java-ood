package ParkingLot;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZXM on 9/16/15.
 */
public class Building {
    private final int numOfFloors = 3;
    private final int numOfChargers = 3;
    private Floor[] floors;
    private Charger[] chargerses;

    public Building() {
        floors = new Floor[numOfFloors];
        chargerses = new Charger[numOfChargers];
    }

    public boolean hasAvailbleLots() {
        int[] res = new int[VehicleType.values().length];
        int sum = 0;
        for (Floor floor : floors) {
            int[] nums = floor.findAvailableLot();
            for (int i = 0; i < res.length; i++) {
                res[i] += nums[i];
                sum += nums[i];
            }
        }
        printAvailableLotsInfo(res);

        return sum > 0;
    }

    private void printAvailableLotsInfo(int[] LotsInfo) {

    }
}
