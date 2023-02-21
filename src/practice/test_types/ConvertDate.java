package practice.test_types;

import javax.swing.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class ConvertDate {
    static int date = LocalDate.now().getDayOfMonth();

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        if (day == DayOfWeek.SUNDAY || day == DayOfWeek.SATURDAY) {
            System.out.println("Ура! Выходной!");
        } else {
            System.out.println("Эх! Еще пахать и пахать!");
        }
        int hour = LocalTime.now().getHour();
        int minutes = LocalTime.now().getMinute();
        int seconds = LocalTime.now().getSecond();
        System.out.println(hour + ":" + minutes + ":" + seconds);
        frame.setTitle(hour + ":" + minutes + ":" + seconds);
        frame.setSize(640,480);
        frame.show();


    }

}
