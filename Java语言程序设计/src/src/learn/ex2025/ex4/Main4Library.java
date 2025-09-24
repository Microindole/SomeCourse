package learn.ex2025.ex4;

import java.util.ArrayList;

public class Main4Library {
    public static void main(String[] args) {
        // 创建5个Book对象和5个EBook对象
        Book b1 = new Book("book1", "author1", 2017, "p1", 2);
        Book b2 = new Book("book2", "author2", 2017, "p2", 1);
        Book b3 = new Book("book3", "author3", 2018, "p3", 3);
        Book b4 = new Book("book4", "author4", 2018, "p4", 1);
        Book b5 = new Book("book5", "author5", 2019, "p5", 2);
        EBook e1 = new EBook("ebook1", "author3", 2019, "p3", "PDF");
        EBook e2 = new EBook("ebook2", "author3", 2020, "p3", "PDF");
        EBook e3 = new EBook("ebook3", "author4", 2020, "p4", "PDF");
        EBook e4 = new EBook("ebook4", "author5", 2021, "p2", "DOC");
        EBook e5 = new EBook("ebook5", "author1", 20, "p1", "DOC");
        // 创建书本的列表
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1); books.add(b2); books.add(b3); books.add(b4); books.add(b5);
        ArrayList<EBook> ebooks = new ArrayList<>();
        ebooks.add(e1); ebooks.add(e2); ebooks.add(e3); ebooks.add(e4); ebooks.add(e5);

        // 对没有吧书添加数据，用户A,B,C,D
        b1.borrow("用户A", "2025-04-27");
        b1.returnBook("用户A", "2025-04-28");
        b2.borrow("用户B", "2025-04-27");
        b2.borrow("用户B", "2025-04-28");
        b3.borrow("用户C", "2025-04-27");
        b4.borrow("用户D", "2025-04-27");
        e1.access("用户A", "2025-04-27");
        e1.access("用户B", "2025-04-27");
        e2.access("用户C", "2025-04-27");
        e3.access("用户D", "2025-04-27");
        e3.access("用户A", "2025-04-28");
        e4.access("用户B", "2025-04-28");
        e5.access("用户C", "2025-04-28");
        e5.access("用户D", "2025-04-28");
        // 输出结果
        System.out.println("\n所有书籍信息: ");
        for (Book b : books) {
            b.printResourceInfo();
            System.out.println("\n");
        }
        System.out.println("\n所有电子书信息: ");
        for (EBook e : ebooks) {
            e.printResourceInfo();
            System.out.println("\n");
        }
    }
}
