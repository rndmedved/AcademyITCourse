package lesson11.task1;

import java.util.Random;

//Дано слово из четного числа букв. Поменять местами его
//половины. Вывести полученную строку в верхнем регистре
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = generateRandomStringBuilder(10);
        System.out.println("старая строка");
        System.out.println(sb);
        sb.reverse();
        System.out.println("новая строка");
        System.out.println(sb.toString().toUpperCase());

    }

    /**
     * Создает случайную строку длиной от 2 до maxStringLength из случайных символов английского алфавита в нижнем регистре.
     * @param maxStringLength
     * @return
     */
    private static StringBuilder generateRandomStringBuilder(int maxStringLength){
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        int max = (r.nextInt(maxStringLength / 2) * 2);
        for (int i = 0; i < max; i++) {
            char x = (char) (r.nextInt( 122-97) + 97);
            s = s.append(x);
        }

        return s;
    }


}
