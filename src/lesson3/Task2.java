package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    /**
     * Мини калькулятор.
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите знак операции.");
        char c = (char) reader.read();
        reader.readLine();
        System.out.println("Введите первое число.");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число.");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Результат вычисления = " + calc(c, a, b));

        reader.close();

    }
    static int calc(char c, int a, int b) throws IOException {
        int result = 0;
        switch (c){
            case 43: result = sum(a, b);
                break;
            case 45: result = difference(a, b);
                break;
            case 47: result = division(a, b);
                break;
            case 42: result = multiplication(a, b);
                break;
        }
        return result;
    }
    static int sum(int a, int b){
        return a + b;
    }
    static int difference(int a, int b){
        return a - b;
    }
    static int multiplication(int a, int b){
        return a * b;
    }
    static int division(int a, int b) throws IOException {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("делить на 0 нельзя. Введите другое число b.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int newB = Integer.parseInt(reader.readLine());

            return division(a, newB);
        }

    }
}
