package learn.ex2025.ex2;

import java.util.Scanner;

public class ex0203 {

    public static boolean inArray(int[] array, int size, int num) {
        for (int i = 0; i < size; i++)
            if (array[i] == num) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] uniqueNumbers = new int[10]; 
        int count = 0;
        System.out.println("请输入10个整数：");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            if (!inArray(uniqueNumbers, count, num)) {
                uniqueNumbers[count] = num;
                count++;
            }
        }
        System.out.println("互不相同的数为：");
        for (int i = 0; i < count; i++)
            System.out.print(uniqueNumbers[i] + " ");

    }

}
