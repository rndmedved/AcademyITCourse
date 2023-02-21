package lesson4;

import java.util.Arrays;
/*Создать метод, который создает и возвращает массив случайных целых чисел. Найти
среднее арифметическое полученного массива. Можно среднее арифметическое в теле
метода main.*/
public class Task1 {
    public static void main(String[] args) {
        int[] testArr = arrRandomNumbers(20, 0, 10);
        System.out.println(Arrays.toString(testArr));
        System.out.println(averageArr(testArr));
    }

    /**
     * Метод возвращает массив длиной n из случайных чисел.
     * Случайные числа лежат в диапазоне [minValue, maxValue]
     * @param n
     * @param minValue
     * @param maxValue
     * @return array of int.
     */
    static int[] arrRandomNumbers(int n, int minValue, int maxValue){
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] =(int) Math.round(Math.random()*(maxValue - minValue) + minValue);
        }
        return result;
    }

    /**
     * Метод возвращает среднее арифметическое входящего массива int
     */
    static int averageArr(int[] input){
        int sum = 0;
        for(int x:input){
            sum +=x;
        }
        return sum / input.length;
    }
}
