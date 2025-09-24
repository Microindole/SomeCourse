package learn.review.chapter2;

import java.util.Scanner;

public class LiLv {

    public  static double finalMoney(double money, int month,double rate){
        double monthRate = 1 + rate / 12.0;
        double moneyLate = 0;
        for (int i = 0; i < month; i++){
            money = (moneyLate +100) * monthRate;
            moneyLate = money;
        }
        return money;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the money: ");
        double money = sc.nextDouble();
        System.out.println("input the month: ");
        int month  = sc.nextInt();
        System.out.println("The final money is "+ finalMoney(money, month, 0.05));
    }
}
