package lesson14.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class QuickSortTest {
       public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество элементов в массиве.");
            int arrLength = Integer.parseInt(reader.readLine());
            System.out.println("Введите значение, соответствующее верхнему потолку для элементов в массиве.");
            int maxValue = Integer.parseInt(reader.readLine());
            int[] arr = createArray(arrLength, maxValue);
            System.out.println("Не сортированный массив:");
            System.out.println(Arrays.toString(arr));
            arr = quickSort(arr);
            System.out.println("Отсортированный массив: ");
            System.out.println(Arrays.toString(arr));
        } catch (IOException e){
            System.out.println("smth error: " + e);
        }
    }
    private static int[]quickSort(int[] arr){
       return quickSort(arr, 0 , arr.length - 1);
          //Этим методом хочу ограничить пользователя на диапазон
          // выбора параметров сориторвки.
    }
    private static int[] quickSort(int[] arr, int low, int high){
        if (arr.length == 0){
            return arr; //завершаю сортировку, если длина массива равно 0
        }
        if(low >= high){
            return arr; //Завершить выполнение, если уже нечего делить.
        }
        int middle = low + (high - low)/2;
        int support = arr[middle];// выбор опорного элемента
        // резделить на подмассивы, которые больше или меньше опорного элемента.
        int i = low, j = high;
        while (i <= j){
            while(arr[i] < support){
                i++;
            }
            while(arr[j] > support){
                j--;
            }
            if (i <= j) { //меняем местами значения
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
//                arr[i] += arr[j];  //Я не понял, почему не сработал такой метод замены значений элементов массива...
//                arr[j] = arr[i] - arr[j];
//                arr[i] -= arr[j];
                i++;
                j--;
            }
            // вызываем рекурсию для сортировки левой и правой части

            if(low < j){
                quickSort(arr, low, j);
            }
            if(high > i){
                quickSort(arr, i, high);
            }
        }

        return arr;
    }


    /**
     * Метод создает массив случайных чисел длинной arrLength
     * @param arrLength
     * @param maxValue
     * @return
     */

    private static int[] createArray(int arrLength, int maxValue){
        if (arrLength < 0) {return null;} //если число меньше 0, ничего не создаем.
        int[] result = new int[arrLength];
        Random r = new Random();
        for (int i = 0; i < arrLength; i++) {
            result[i] = r.nextInt(maxValue);
        }
        return result;
    }
}
