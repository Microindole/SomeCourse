package learn.review.chapter3;

import java.util.Scanner;

public class XingQiJi {
    public static void qxj(int q,int m,int j, int k){
        String[] day = {"星期六","星期天","星期一","星期二","星期三","星期四","星期五"};
        int index;
        index = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        System.out.println(day[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        if(month<3){
            month+=12;
            year--;
        }
        int j = year / 100;
        int k = year % 100;
        qxj(day,month,j,k);

    }
}
