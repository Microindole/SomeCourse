package learn.classes.ClassTest;

import java.util.Scanner;

public class source {

    public static int A(){
        return (int) (Math.random()*20);
    }

    public static int B(){
        return (int) (10 + (Math.random()*10));
    }

    public static int C(){
        return (int) (Math.random()*51);
    }

    public static int D(){
        return (Math.random() >= 0.5 ? 1 : 0);
    }

    public static void guess(){
        int num = (int) (Math.random()*101);
        Scanner sc = new Scanner(System.in);
        int text;


        do {
            System.out.println("请输入数字：");
            text = sc.nextInt();
            if (text > num)
                System.out.println("大了");
            else if(text <num)
                System.out.println("小了");
            else
                System.out.println("正确");
        } while (text != num);
    }

    public static void endWithPoint(){
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        num = sc.nextInt();
        while(num != 0){
            sum += num;
            System.out.println("请输入数字：");
            num = sc.nextInt();

        }
        System.out.println("sum is "+ sum);

    }

    public static void tax(){

        double num, tax;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入纳税额: ");
        num = sc.nextDouble();
        int dTax = (int) (num * 0.06 * 100);
        tax = ((double) dTax)/100;

        System.out.println(tax);
//        System.out.printf(String.valueOf(2d),tax);
    }

    public static void degreeTransform(){
        double fahrenheit;
        double celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入华氏度: ");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("摄氏度为: "+celsius);
    }

}
