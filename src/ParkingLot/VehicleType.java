package ParkingLot;

/**
 * Created by ZXM on 9/16/15.
 */
public enum VehicleType {
    MOTOR(0), CAR(1), BUS(2);
    private int value;
    private VehicleType(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }


}
