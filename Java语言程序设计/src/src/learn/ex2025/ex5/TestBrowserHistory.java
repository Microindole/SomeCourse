package learn.ex2025.ex5;

public class TestBrowserHistory {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.visit("www.google.com");
        history.visit("www.github.com");
        history.visit("www.oracle.com");
        history.visit("www.wikipedia.org");
        System.out.println("历史记录（最新在后）： " + history);
        System.out.println("\n回退操作：");
        while (!history.isEmpty()) {
            String last = history.back();
            System.out.println("回退到了：" + last);
        }
    }
}
