package learn.ex2025.ex5;

public class TestLibrary {
    public static void main(String[] args) {
        // 创建图书馆
        Library library = new Library("City Library");

        // 添加图书
        library.addBook(new Book("Java 编程思想", "Bruce Eckel", "123456"));
        library.addBook(new Book("深入理解计算机系统", "Randal E. Bryant", "654321"));
        library.addBook(new Book("数据结构与算法分析", "Mark Allen Weiss", "112233"));

        // 打印图书总数与列表
        System.out.println("图书馆包含图书数量：" + library.getBooks().size());
        for (Book b : library.getBooks()) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }

        // 查找图书
        Book found = library.findBookByTitle("Java 编程思想");
        if (found != null) {
            System.out.println("已找到：" + found.getTitle() + " - ISBN：" + found.getIsbn());
        }

        // 删除图书
        library.removeBook("654321");
        System.out.println("删除后图书数量：" + library.getBooks().size());
    }
}
