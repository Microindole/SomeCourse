package learn.classes.experiment.experiment2;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int [] numbers = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入1-100之间的整数：");
        int num = sc.nextInt();
        while (num != 0) {
            if(num>0 && num<100) {
                numbers[num-1]++;
            }else{
                System.out.println("输入数字有误");
            }
            num = sc.nextInt();
        }
        for (int i = 0; i < 100; i++) {
            if(numbers[i]>0) {
                System.out.println((i+1)+" 出现 "+numbers[i]+" 次");
            }
        }
    }
}
