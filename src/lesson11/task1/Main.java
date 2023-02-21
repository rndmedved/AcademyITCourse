package lesson11.task1;

import java.util.Random;

//Дано слово из четного числа букв. Поменять местами его
//половины. Вывести полученную строку в верхнем регистре
public class Main {
    public static void main(String[] args) {
        String s = "";
        Random r = new Random();
        int max = (r.nextInt(10) * 2);
        for (int i = 0; i < max; i++) {
            char x = (char) (r.nextInt( 122-97) + 97);
            s = s.concat(x + "");
        }
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(max);
    }
}
