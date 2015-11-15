package UberEat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZXM on 11/13/15.
 */
public class Order {
    private int id;
    private Map<Integer, Integer> quantityMap; //dish id => quantity
    private Map<Integer, Dish> dishMap; //dish id => dish
    private User user;
    private Driver driver;

    public Order(int id, User user, Driver driver) {
        this.id = id;
        dishMap = new HashMap<>();
        this.user = user;
        this.driver = driver;
    }

    public int getId() {
        return id;
    }


    public double getPrice() {
        double total = 0;
        for (Integer id : dishMap.keySet()) {
            Dish dish = dishMap.get(id);
            int quantity = quantityMap.get(id);
            total += dish.getPrice() * quantity;
        }

        return total;
    }

    public User getUser() {
        return user;
    }

    public Driver getDriver() {
        return driver;
    }
}
