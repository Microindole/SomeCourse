package learn.ex2025.ex4;

public class Book extends LibraryResource {
    private int availableNumber;

    public Book(String title, String author, int year, String publisher, int availableNumber) {
        super(title, author, year, publisher);
        this.availableNumber = availableNumber;
        setAvailable(availableNumber > 0);
    }

    public int getAvailableNumber() {
        return availableNumber;
    }

    public void setAvailableNumber(int availableNumber) {
        this.availableNumber = availableNumber;
        setAvailable(availableNumber > 0);
    }

    public void borrow(String userName, String date) {
        if (availableNumber > 0) {
            availableNumber--;
            setAvailable(availableNumber > 0);
            records.add(new Record(date, userName, "borrow", getTitle()));
            System.out.println(userName + " 借阅了《" + getTitle() + "》，剩余可借数量: " + availableNumber);
        } else {
            System.out.println("《" + getTitle() + "》已无可借数量，借阅失败！");
        }
    }

    public void returnBook(String userName, String date) {
        availableNumber++;
        setAvailable(true);
        records.add(new Record(date, userName, "return", getTitle()));
        System.out.println(userName + " 归还了《" + getTitle() + "》，剩余可借数量: " + availableNumber);
    }

    @Override
    public void printResourceInfo() {
        super.printResourceInfo();
        System.out.println("剩余可借数量: " + availableNumber);
    }
}
