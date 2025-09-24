package learn.ex2025.ex4;

import java.util.ArrayList;

public class LibraryResource {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private boolean isAvailable = true;
    protected ArrayList<Record> records = new ArrayList<>();

    public LibraryResource(String title, String author, int year, String publisher) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public ArrayList<Record> getRecords() { return records; }

    public void printResourceInfo() {
        System.out.println("标题: " + title);
        System.out.println("作者: " + author);
        System.out.println("出版年份: " + year);
        System.out.println("出版社: " + publisher);
        System.out.println("是否可用: " + isAvailable);
        System.out.println("记录:");
        for (Record r : records) {
            System.out.println("  " + r);
        }
    }
}
