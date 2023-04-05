package tests;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now(ZoneId.systemDefault()));
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR) + " " +
                (calendar.get(Calendar.MONTH) + 1) + " " +
                calendar.get(calendar.DATE));
        int i = 0;
        for (; ;) {
            i++;
            if (i==5){
                break;
            }
            System.out.println(i);
        }

    }
}
