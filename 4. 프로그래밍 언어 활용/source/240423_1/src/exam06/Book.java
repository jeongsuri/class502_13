package exam06;

public class Book {
    private int isbn;
    private String title;
    private String author;

    public Book(int isbn,String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("isbn=%d","title=%s","author=%s",isbn,title,author);
    }
}
