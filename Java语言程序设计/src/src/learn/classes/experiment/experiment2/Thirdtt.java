package learn.classes.experiment.experiment2;

import java.util.Scanner;


//没写完
public class Thirdtt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入10个整数:");
        int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        boolean [] flags = new boolean[10];
        for (int i = 0; i < arr.length-1; i++) {
            if (!flags[i]) {
                for(int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j] || !flags[j]) {
                        flags[i] = true;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < flags.length; i++) {
            if(!flags[i]) {
                System.out.print(arr[i]+"  ");
            }
        }

    }
}
