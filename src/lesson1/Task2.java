package lesson1;

import javax.swing.JOptionPane;

public class Task2 {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Введите 1 число"));
        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Введите 2 число"));
        int number3 = Integer.parseInt(JOptionPane.showInputDialog("Введите 3 число"));
//        number1*=2;
//        number2-=3;
//        number3*=number3;
//        System.out.println("sum = " + number1 + number2 + number3);
        System.out.printf("Sum of changed numbers %d, %d and %d is %d!\n",
                number1, number2, number3,
                number1 * 2 + number2 - 3 + number3 * number3);
    }
}
