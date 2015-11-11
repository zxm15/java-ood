package BusEvent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zxm on 10/23/15.
 */
public class BusUser implements Observer{
    private Map<String, Object> events;
    private Subject eventCenter;
    private int id;
    public BusUser(int id, Subject eventCenter) {
        this.id = id;
        this.eventCenter = eventCenter;
        events = new HashMap<>();
    }
    @Override
    public void onEvent(String event, Object data) {
        events.put(event, data);
    }


}
