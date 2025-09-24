package learn.ex2025.ex5;
import java.util.ArrayList;
public class Library {
    private String libraryName;
    ArrayList<Book> books = new ArrayList<>();
    Library(){}
    Library(String libraryName){
        this.libraryName = libraryName;
    }
    public String getLibraryName() {
        return libraryName;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public void removeBook(String isbn){
        books.removeIf(book -> book.getIsbn().equals(isbn));
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
    public Book findBookByTitle(String title){
        for(Book book : books){
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }
}
