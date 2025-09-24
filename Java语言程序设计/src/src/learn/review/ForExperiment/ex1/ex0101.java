package learn.review.ForExperiment.ex1;

import java.util.Scanner;

public class ex0101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ji = 0, ou = 0, num, count = 0;
        num = scanner.nextInt();
        if(num < 0 || num > 100_000_000){
            System.out.println("error");
        }
        while (num / 10 != 0 || num % 10 != 0){
            if(count % 2 == 0) ji += num % 10;
            else ou += num % 10;
            count++;num /= 10;
        }
        System.out.println(ji * ou);

    }
}
