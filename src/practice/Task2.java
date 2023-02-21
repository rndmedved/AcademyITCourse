package practice;

import javax.swing.*;

/*
* Ввести трехзначное число и посчтитать произведение всех его цифр
* */
public class Task2 {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Введите трехзначное число"));
//        328
        int n1 = number / 100;
        int n2 = number % 100 / 10;
        int n3 = number % 10;
        System.out.println(n1 * n2 * n3);

    }
}
