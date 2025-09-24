package learn.ex2025.ex1;

import java.util.Scanner;

public class ex0102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个骰子点数之和（范围为2到12）：");
        int sum = scanner.nextInt();
        if (sum < 2 || sum > 12) {
            System.out.println("用户输入超过限制");
        }
        int count = 1; 
        for (int num1 = 1; num1 <= 6; num1++) {
            for (int num2 = 1; num2 <= 6; num2++) {
                if (num1 + num2 == sum) {
                    System.out.println("第" + count + "种情况：第1个骰子为" + num1 + "，第2个骰子为" + num2 + "。");
                    count++;
                }
            }
        }
    }
}
