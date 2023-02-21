package lesson7.task1;

import java.util.Arrays;

public class ArrDivision implements IDivisible {
    private int[] arr1;
    private int[] arr2;

    /**
     * Метод делит попарно элементы первого массива на элементы второго.
     * При возниконовении исключения выводит сообщение о недопустимой мат. операции.
     */
    @Override
    public void division() {
        int i = 0;
        for (int element : arr2) {
            try {
                System.out.printf("%d / %d = %d остаток от деления - %d\n", arr1[i], element, arr1[i] / element, arr1[i] % element);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero.");
            }
            i++;
        }
    }

    /**
     * Конструктор принимает два массива и инициализирует массивы объекта.
     * При этом, если длины массивов были заданы неверно (не равны друг другу)
     * инициализирует более длинный массив количеством элементов более короткого.
     * @param arr1
     * @param arr2
     */
    public ArrDivision(int[] arr1, int[] arr2) {
        this.arr1 = arr1.length <= arr2.length ? arr1 : Arrays.copyOf(arr1, arr2.length);
        this.arr2 = arr2.length <= arr1.length ? arr2 : Arrays.copyOf(arr2, arr1.length);
    }

    public int[] getArr1() {
        return arr1;
    }

    public int[] getArr2() {
        return arr2;
    }
}
