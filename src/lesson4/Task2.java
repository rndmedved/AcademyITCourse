package lesson4;
// Здесь лежит решения задач №2 и №3.
import java.util.Arrays;

/*
Вывести массив, состоящий из цветов радуги в обратном порядке.
Перевернуть массив, который содержит названия цветов радуги. То есть первый
элемент должен стать последним второй – предпоследним.
 */
public class Task2 {
    public static void main(String[] args) {
        String[] rainbowColors = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
        System.out.println(Arrays.toString(invertedArray(rainbowColors)));
//        Перевернуть массив, который содержит названия цветов радуги. То есть первый
//        элемент должен стать последним второй – предпоследним.
    }

    /**
     * Метод переворачивает входящий массив.
     *
     * @param arr
     * @return
     */
    private static String[] invertedArray(String[] arr) {
        int i = arr.length;
        String[] result = new String[i];

        for (String s : arr) {
            i--;
            result[i] = s;
        }
        return result;
    }
}
