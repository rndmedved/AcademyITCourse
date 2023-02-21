package lesson3;

public class Task1ExamMethods {
    /**
     * Нахождение простых чисел от 1 до n тремя методами
     * 1 метод - проверка каждого числа на деление от 2 до i, где i - проверяемое число
     * 2 метод - проверка каждого числа на деление от 2 до i/2, где i - проверяемое число
     * 3 метод - проверка каждого числа на деление от 2 до sqrt(i), где i - проверяемое число
     */

    public static void main(String[] args) {
        long time = System.currentTimeMillis(); // Для себя определил время работы каждого метода в мс.
        int n = 100;
        simpleNumbers1(n);
        System.out.println();
        System.out.println("Время выполнения 1 метода - " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        simpleNumbers2(n);
        System.out.println();
        System.out.println("Время выполнения 2 метода - " + (System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        simpleNumbers3(n);
        System.out.println();
        System.out.println("Время выполнения 3 метода - " + (System.currentTimeMillis() - time));

    }

    static void simpleNumbers1(int n){
        boolean isSimpleNumber = true;
        for (int i = 2; i <= n; i++) {
            for(int j = 2; j <i; j++){
                if(i % j == 0){
                    isSimpleNumber = false;
                    break;
                }
            }
            if (isSimpleNumber) System.out.printf("%d\t", i);
            isSimpleNumber = true;
        }
    }

    static void simpleNumbers2(int n){
        boolean isSimpleNumber = true;
        for (int i = 2; i <= n; i++) {
            for(int j = 2; j <= Math.round(i/2); j++){
                if(i % j == 0){
                    isSimpleNumber = false;
                    break;
                }
            }
            if (isSimpleNumber) System.out.printf("%d\t", i);
            isSimpleNumber = true;
        }
    }

    static void simpleNumbers3(int n){
        boolean isSimpleNumber = true;
        for (int i = 2; i <= n; i++) {
            for(int j = 2; j <= Math.round(Math.sqrt(i)); j++){
                if(i % j == 0){
                    isSimpleNumber = false;
                    break;
                }
            }
            if (isSimpleNumber) System.out.printf("%d\t", i);
            isSimpleNumber = true;
        }
    }
}
