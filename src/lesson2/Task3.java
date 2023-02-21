package lesson2;
/*
    Написать программу сравнения двух случайных чисел. В результате должна
    содержаться информация – насколько одно число больше другого. Используйте
    модуль числа
*/
public class Task3 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000) - 500;
        int b = (int) (Math.random() * 1000) - 500;
        System.out.println(Math.abs(a - b));
    }

}
