package RequestDispatcher;

/**
 * Created by ZXM on 11/15/15.
 */
public interface Subject {

    public void register(Request request);

    public void unregister(Request request);

    public void sendRequest(Observer observer, Request request);
}
