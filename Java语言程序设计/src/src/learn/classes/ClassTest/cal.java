package learn.classes.ClassTest;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class cal {

    public static void main(String[] args) {
        Calendar cl = new GregorianCalendar(2003,9,12);
        Calendar cl2 = (Calendar) cl.clone();
        System.out.println(cl);
        System.out.println(cl2);

    }
}
