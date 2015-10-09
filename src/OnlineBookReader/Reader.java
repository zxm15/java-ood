package OnlineBookReader;

/**
 * Created by zxm on 10/6/15.
 */
public class Reader {
    private Book book;
    private User user;
    private int currPageNumber = 0;

    public Reader(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    public boolean gotoPage(int pageNumber) {
        if (pageNumber > book.getTotalPages()) return false;
        refreshPage();
        return true;
    }

    public boolean nextPage() {
        if (++currPageNumber > book.getTotalPages()) {
            currPageNumber--;
            return false;
        }
        refreshPage();
        return true;
    }

    public boolean previousPage() {
        if (--currPageNumber < 0) {
            currPageNumber++;
            return false;
        }
        refreshPage();
        return true;
    }

    private void refreshPage() {
        System.out.println("The page is refreshed and ready to read");
    }

    public void openBook(Book book) {
        this.book = book;
    }

    public void closeBook() {
        book = null;
    }


    //getters and setters


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCurrPageNumber() {
        return currPageNumber;
    }

    public void setCurrPageNumber(int currPageNumber) {
        this.currPageNumber = currPageNumber;
    }
}
