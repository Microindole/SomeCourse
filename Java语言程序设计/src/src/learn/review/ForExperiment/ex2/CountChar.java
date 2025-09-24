package learn.review.ForExperiment.ex2;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String string;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        for(int i = 0; i<string.length();i++){
            System.out.println(string.charAt(i));

        }
    }
}
