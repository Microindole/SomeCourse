package learn.ex2025.ex4;

public class EBook extends LibraryResource {
    private String format;
    private int visitNumber = 0;

    public EBook(String title, String author, int year, String publisher, String format) {
        super(title, author, year, publisher);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getVisitNumber() {
        return visitNumber;
    }

    public void access(String userName, String date) {
        visitNumber++;
        records.add(new Record(date, userName, "visit", getTitle()));
        System.out.println(userName + " 访问了电子书《" + getTitle() + "》，累计访问次数: " + visitNumber);
    }

    @Override
    public void printResourceInfo() {
        super.printResourceInfo();
        System.out.println("电子书格式: " + format);
        System.out.println("访问次数: " + visitNumber);
    }
}
