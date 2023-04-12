package lesson14.serch;

import java.util.Random;
import java.util.Scanner;

public class LineSearch {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = null, size, item;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве");
        size = sc.nextInt();
        arr = new int[size];
        boolean isFind = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println("Введите искомый элемент");
        item = sc.nextInt();
        for (int i : arr) {
            if (i == item){
                isFind = true;
                System.out.println("Элемент найден");
                break;
            }
        }
        if (!isFind) System.out.println("Элемент не найден");
    }
}
