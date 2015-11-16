package RequestDispatcher;

/**
 * Created by ZXM on 11/13/15.
 */
public class Driver implements Observer, Runnable{

    private int id;
    private String name;

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean answerRequest(Request request) {
        return true;
    }

    @Override
    public void updateRequest(Request request){

    }

    @Override
    public void run(){}
}
