package ParkingLot;

/**
 * Created by ZXM on 9/16/15.
 */
public class Lot {
    private int id;
    private VehicleType type;
    private boolean isAvailable;

    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getType().getValue() <= type.getValue();
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {

        this.isAvailable = isAvailable;
    }

    public Lot(int id, VehicleType type) {
        this.id = id;
        this.type = type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public void setId(int id) {

        this.id = id;
    }

    public VehicleType getType() {

        return type;
    }

    public int getId() {

        return id;
    }
}
