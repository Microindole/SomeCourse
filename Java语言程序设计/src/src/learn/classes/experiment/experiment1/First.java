package learn.classes.experiment.experiment1;

import java.util.Scanner;

public class First {
     public static void SumNum(int num){
         int i = 0;
         if(num<0 || num>1000){
             System.out.println("输入有误");
         }else{
             while(num>0){
                 i += num % 10;
                 num /= 10;
             }
             System.out.println("各位数字之和为：");
             System.out.println(i);
         }

     }

    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        SumNum(t);
    }
}
