package RentingCar;

/**
 * Created by zxm on 11/13/15.
 */
public enum CarType {
    PASSENGER(0), SUV(1), CRV(2), MINVAN(3), VAN(4), TRUCK(5);
    private int value;

    CarType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(CarType.CRV.getValue());
    }

}


