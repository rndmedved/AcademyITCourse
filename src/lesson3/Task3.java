package lesson3;

import java.time.LocalDate;
import java.util.Scanner;

public class Task3 {
    /**
     * Метод, вовзращающий имя человека и год его рождения.
     */
    final static int MAX_REGISTERED_AGE = 122;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя человека.");
        String name = scanner.nextLine();
        System.out.println("Введите его возраст");
        int age = scanner.nextInt();
        System.out.println(personNameAndAge(name, age));

    }
    static String personNameAndAge(String name, int age){
        String result = null;
        if (name != null && !name.equals("") && age>=0 && age <= MAX_REGISTERED_AGE) {
            result = String.format("Person name is %s, person birth year is %d", name, (LocalDate.now().getYear() - age));
        } else {result = "Введенные данные некоректны";}
        return result;
    }
}
