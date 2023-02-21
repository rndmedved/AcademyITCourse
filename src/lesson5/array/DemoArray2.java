package my.test.array;

import java.util.Arrays;

public class DemoArray2 {
    public static void main(String[] args) {
//        Создать массив чисел 10 20 30 ... 100
        int mas[] = new int[10];
        for(int i = 0;i < mas.length;i++){
            mas[i] = 10*(i + 1);
//            System.out.println(mas[i]);
        }
        System.out.println(Arrays.toString(mas));


    }
}
