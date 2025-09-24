package learn.ex2025.ex7;

import java.io.*;
import java.util.*;

public class ex0703 {
    public static void main(String[] args) {
        String fileName = "src/learn/ex2025/ex7/Exper_7_3.txt";
        String sortedFileName = "src/learn/ex2025/ex7/Exper_7_3_sorted.txt";
        int totalNumbers = 1000;
        int numbersPerLine = 10;
        int[] numbers = new int[totalNumbers];
        File file = new File(fileName);
        if (!file.exists()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
                Random rand = new Random();
                for (int i = 0; i < totalNumbers; i++) {
                    int num = rand.nextInt(10000);
                    writer.print(num);
                    if ((i + 1) % numbersPerLine == 0) {
                        writer.println();
                    } else {
                        writer.print(" ");
                    }
                }
                System.out.println("已生成文件：" + fileName);
            } catch (IOException e) {
                System.out.println("写入文件时出错: " + e.getMessage());
                return;
            }
        }
        int count = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt() && count < totalNumbers) {
                numbers[count++] = scanner.nextInt();
            }
        } catch (IOException e) {
            System.out.println("读取文件时出错: " + e.getMessage());
            return;
        }
        Arrays.sort(numbers);
        try (PrintWriter writer = new PrintWriter(new FileWriter(sortedFileName))) {
            for (int i = 0; i < totalNumbers; i++) {
                writer.print(numbers[i]);
                if ((i + 1) % numbersPerLine == 0) {
                    writer.println();
                } else {
                    writer.print(" ");
                }
            }
            System.out.println("已写入排序文件：" + sortedFileName);
        } catch (IOException e) {
            System.out.println("写入排序文件时出错: " + e.getMessage());
        }
    }
}