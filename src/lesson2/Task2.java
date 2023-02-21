package lesson2;
/*
    Объявить две целочисленные переменные «a» и «b» и задать им
    произвольные начальные значения. Затем написать скрипт, который работает
    по следующему принципу:
    если “a” и “b” положительные, вывести их разность;
    если “a” и “b” отрицательные, вывести их произведение;
    если “a” и “b” разных знаков, вывести их сумму;
*/
public class Task2 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 1000) - 500;
        int b = (int) (Math.random() * 1000) - 500;
        if(a * b > 0){
            if (a > 0) {
                System.out.printf("%d - %d = %d", a , b, a - b);
            } else {
                System.out.printf("%d * (%d) = %d", a , b, a * b);
            }
        } else {
            System.out.printf("%d + (%d) = %d", a , b, a + b);
        }
    }
}
