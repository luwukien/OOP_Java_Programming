package data;

public class Book {
    private String title;
    private String author;
    private double ratingBook;
    private int year;

    public Book(String title, String author, double ratingBook, int year) {
        this.title = title;
        this.author = author;
        this.ratingBook = ratingBook;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRatingBook() {
        return ratingBook;
    }

    public void setRatingBook(float ratingBook) {
        this.ratingBook = ratingBook;
    }
}
