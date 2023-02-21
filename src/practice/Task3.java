package practice;

//Сделать обмен значений двух числовых переменных

public class Task3 {
    public static void main(String[] args) {
        int a = 10, b = 20;
//        int c = a;//c = 10
//        a = b;//a = 20
//        b = c;

        a = a + b;//a = 30
        b = a - b;//b = 10
        a = a - b;//a = 20


        System.out.println("a = " + a + "\nb = " + b);

    }
}
