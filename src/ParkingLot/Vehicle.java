package ParkingLot;

/**
 * Created by ZXM on 9/16/15.
 */
public class Vehicle {
    private VehicleType type;
    private String plateNumber;
    private Driver driver;

    public Vehicle(VehicleType type, String plateNumber) {
        this.type = type;
        this.plateNumber = plateNumber;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setType(VehicleType type) {

        this.type = type;
    }

    public String getPlateNumber() {

        return plateNumber;
    }

    public VehicleType getType() {

        return type;
    }
}
