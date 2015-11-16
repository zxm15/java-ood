package Elevator;

/**
 * Created by ZXM on 11/15/15.
 */
public class App {

    public static final int FLOOR = 100;
    public static final int numberOfElevator = 8;


    public static void main(String args) {

        Dispatcher dispatcher = new Dispatcher();
        for (int i = 0; i < FLOOR; i++) {
            Thread producer = new Thread(new Runnable() {
                @Override
                public void run() {
                    dispatcher.putTask(10);
                }
            });

            producer.start();
        }

        for (int i = 0; i < numberOfElevator; i++) {
            Thread consumer = new Thread(new Elevator() {
                @Override
                public void run() {
                    dispatcher.takeTask(this);
                }
            });

            consumer.start();
        }



    }
}
