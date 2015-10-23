package BusEvent;

import java.util.*;

/**
 * Created by zxm on 10/23/15.
 */
public class BusEventCenter implements Subject{
    private Map<String, Set<Observer>> map;
    public BusEventCenter() {
        map = new HashMap<>();
    }

    @Override
    public void register(String event, Observer observer) {
        if (! map.containsKey(event)) throw new IllegalArgumentException("The event does not exist");
        map.get(event).add(observer);
    }

    @Override
    public void unregister(String event, Observer observer) {
        if (! map.containsKey(event)) throw new IllegalArgumentException("The event does not exist");
        Set<Observer> set = map.get(event);
        if (! set.contains(observer)) throw new IllegalArgumentException("You are not registering this event");
        set.remove(observer);
    }

    @Override
    public void postEvent(String event, Object data) {
        if (! map.containsKey(event)) {
            map.put(event, new HashSet<>());
            return;
        }
        Set<Observer> set = map.get(event);
        for (Observer observer : set) {
            observer.onEvent(event, data);
        }
    }

}
