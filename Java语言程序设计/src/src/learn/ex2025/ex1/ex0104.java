package learn.ex2025.ex1;

import java.util.Scanner;

public class ex0104 {
    public static void main(String[] args) {
        double M, P, r, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("贷款总额为: (单位: 元)");
        P = sc.nextDouble();
        System.out.println("年利率为: (%)");
        double nr = sc.nextDouble();
        r = nr / 12 / 100;
        System.out.println("贷款期限为: (单位: 年)");
        double year = sc.nextDouble();
        n = year * 12;
        M = P * r * Math.pow(1 + r, n) / (Math.pow(1 + r, n) - 1);
        double money = M * n - P;
        System.out.print("总利息支出金额为: ");
        System.out.printf("%.2f", money);
        System.out.println("元");

    }

}
