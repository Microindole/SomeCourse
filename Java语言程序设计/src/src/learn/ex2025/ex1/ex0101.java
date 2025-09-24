package learn.ex2025.ex1;

import java.util.Scanner;

public class ex0101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个0到100,000,000之间的整数：");
        long number = scanner.nextLong();
        if (number < 0 || number > 100_000_000) {
            System.out.println("用户输入超过限制");
            return;
        }
        long oddSum = 0, evenSum = 0, div2 = 1;
        while (number > 0) {
            long digit = number % 10;
            if (div2 % 2 == 1) {
                oddSum += digit; 
            } else {
                evenSum += digit; 
            }
            number /= 10; 
            div2 ++;
        }
        long result = oddSum * evenSum;
        System.out.println("奇数位数字和：" + oddSum);
        System.out.println("偶数位数字和：" + evenSum);
        System.out.println("最终结果：" + result);
    }
}
