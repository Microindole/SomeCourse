package learn.classes.experiment.experiment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Forth {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int [] arr = new int[10];
//        List<int[]> list = new ArrayList<int[]>();>
//        int [] arr2 = new int[10];
//        int index = 0;
//        System.out.println("输入10个整数：");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] : arr2)
//        }
//        System.out.println("互不相同的数为：");
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数：");
        System.out.println("第一个数：");
        a = sc.nextInt();
        System.out.println("第二个数：: ");
        b = sc.nextInt();
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int t;
        while (a % b != 0) {

            t = a % b;
            a = b;
            b = t;
        }
        System.out.println("最大公约数为：");
        System.out.println(b);

    }
}
