package lesson1;

import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task4 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Введите год вашего рождения."));
        Calendar userBirthYear = new GregorianCalendar();
        userBirthYear.set(Calendar.YEAR, year);
        Calendar calendar = new GregorianCalendar();
        int age = calendar.getWeekYear() - userBirthYear.getWeekYear();
        if (age % 10 == 1) {
            System.out.printf("Вам исполнится или исполнилось в этом году %d год.\n", age);
        } else if (age % 10 == 2 || age % 10 == 3 || age % 10 == 4) {
            System.out.printf("Вам исполнится или исполнилось в этом году %d года.\n", age);
        } else {
            System.out.printf("Вам исполнится или исполнилось в этом году %d лет.\n", age);
        }
        int timeToPension = 65 - age;
        if (timeToPension <= 0) {
            System.out.println("Вы получаете пенсию, можно ни о чем не переживать.");
        } else if (timeToPension % 10 == 1) {
            System.out.printf("До пенсии вам работать еще %d год.", timeToPension);
        } else if (timeToPension % 10 == 2 || timeToPension % 10 == 3 || timeToPension % 10 == 4) {
            System.out.printf("До пенсии вам работать еще %d года.", timeToPension);
        } else {
            System.out.printf("До пенсии вам работать еще %d лет.", timeToPension);
        }
    }
}
