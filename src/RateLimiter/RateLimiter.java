package RateLimiter;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zxm on 11/12/15.
 */
public class RateLimiter {
    //below two are for designing for every second
    private long prevSecond;
    private int counter = 0;
    //below one is for designing for any second
    private Queue<Long> queue;
    public RateLimiter() {
        prevSecond = System.currentTimeMillis() / 1000;
        queue = new LinkedList<>();
    }

    public boolean handleRequestWithCounter() {
        long currSecond = System.currentTimeMillis() / 1000;
        if (prevSecond != currSecond) {
            prevSecond = currSecond;
            counter = 0;
        }
        if (counter < 5) {
            counter++;
            return true;
        }
        return false;
    }

    public boolean handleRequestWithQueue() {
        long currSecond = System.currentTimeMillis();
        if (currSecond - queue.peek() > 1) {
            queue.poll();
            queue.offer(currSecond);
            return true;
        } else {
            if (queue.size() < 5) {
                queue.offer(currSecond);
                return true;
            } else return false;
        }
    }


}
