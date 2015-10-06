package OnlineBookReader;

import java.util.Timer;

/**
 * Created by zxm on 10/6/15.
 */
public class Book {

    private int id;
    private String name;
    private String author;
    private Timer published;
    private boolean isAvailable = true;

    public Book(int id, String name, String author, Timer published) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.published = published;
    }
}
