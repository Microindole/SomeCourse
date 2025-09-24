package learn.ex2025.ex3;

public class Book {
    private final int HARDCOVER = 1;
    private final int PAPERBACK = 2;
    private final int EBOOK     = 3;

    private String title;
    private String author;
    private int type;
    private boolean available;

    public Book(){
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.type = HARDCOVER;
        this.available = true;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getType() {
        return type;
    }

    public String showType(){
        return switch (type) {
            case PAPERBACK -> "PAPERBACK";
            case EBOOK -> "EBOOK";
            default -> "HARDCOVER";
        };

    }

    public void setType(int type) {
        this.type = type;
    }

    public String toString(){
        if (available){
            return "《"+title+"》by "+author+" is available (Type: "+showType()+")";
        }
        return "《"+title+"》by "+author+" is not available";
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Andersen's Fairy Tales");
        book1.setAuthor("Hans Christian Andersen");
        book1.setType(1); // HARDCOVER
        book1.setAvailable(true);

        Book book2 = new Book();
        book2.setTitle("Java Programming");
        book2.setAuthor("John Doe");
        book2.setType(3);
        book2.setAvailable(false);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
