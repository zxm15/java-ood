package BusEvent;

/**
 * Created by zxm on 10/23/15.
 */
public interface Subject {

    public void register(String event, Observer observer);
    public void unregister(String event, Observer observer);
    public void postEvent(String event, Object data);

}
