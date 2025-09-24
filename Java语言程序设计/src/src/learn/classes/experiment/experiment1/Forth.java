package learn.classes.experiment.experiment1;

import java.util.Scanner;

import static learn.classes.experiment.experiment1.Third.LeapYear;

public class Forth {

    public static void main(String[] args) {
        int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
        int[] commonYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] day = new int [12];
        String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        String [] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter day: ");
        day[0] = sc.nextInt();
        sc.close();
        if (LeapYear(year)){
            for (int i = 1; i <= day.length; i++) {
                day[i] = (day[i-1] + leapYear[i-1]) % 7;
            }
        }else{
            for (int i = 1; i < day.length; i++) {
                day[i] = (day[i-1] + commonYear[i-1]) % 7;
            }
        }
        for (int i = 0; i < day.length; i++) {
            System.out.println(months[i]+" 1, "+year+" is "+days[day[i]]);
        }
    }
}
