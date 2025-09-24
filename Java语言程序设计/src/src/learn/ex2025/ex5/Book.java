package learn.ex2025.ex5;
public class Book {
    private String title;
    private String author;
    private String isbn;
    Book(){}
    Book(String title, String author, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
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
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
