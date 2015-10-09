package OnlineBookReader;

import java.util.Timer;

/**
 * Created by zxm on 10/6/15.
 */
public class Book {

    private int id;
    private int totalPages;
    private String name;
    private String author;
    private Timer published;
    private boolean isAvailable = true;

    public Book(int id, int totalPages, String name, String author, Timer published) {
        this.id = id;
        this.totalPages = totalPages;
        this.name = name;
        this.author = author;
        this.published = published;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timer getPublished() {
        return published;
    }

    public void setPublished(Timer published) {
        this.published = published;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
