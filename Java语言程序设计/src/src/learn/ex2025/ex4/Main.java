package learn.ex2025.ex4;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("张三",1,13500);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("李四",2,13500);
        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee("王五",3,14000);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("赵六",10,20,700);
        fullTimeEmployee1.showYearEndBonus();
        fullTimeEmployee2.showYearEndBonus();
        fullTimeEmployee3.showYearEndBonus();
        fullTimeEmployee1.showInfo();
        fullTimeEmployee2.showInfo();
        fullTimeEmployee3.showInfo();
        partTimeEmployee1.showInfo();

    }
}
