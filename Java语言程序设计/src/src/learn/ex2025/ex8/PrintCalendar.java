package learn.ex2025.ex8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalendar {
    public static void main(String[] args) {
        int year, month;
        Calendar today = Calendar.getInstance();

        if (args.length == 2) {
            month = Integer.parseInt(args[0]);
            year = Integer.parseInt(args[1]);
        } else if (args.length == 1) {
            month = Integer.parseInt(args[0]);
            year = today.get(Calendar.YEAR);
        } else {
            month = today.get(Calendar.MONTH) + 1;
            year = today.get(Calendar.YEAR);
        }
        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {

        System.out.println("\t\t" + year + "年\t" + month + "月");
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        Calendar cal = new GregorianCalendar(year, month - 1, 1);
        int start = cal.get(Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i < start; i++) {
            System.out.print("\t");
        }
        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.print(day+"\t");
            if ((day + start - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}