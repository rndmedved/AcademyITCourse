package practice;

import javax.print.attribute.standard.JobPriority;
import javax.swing.*;

/*
Даны катеты прямоугольного треугольника. Найдите площадь и периметр треугольника.
*/
public class Task1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Введите значение первого катета"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Введите значение второго катета"));
        double c = Math.sqrt(a * a + b * b);//получили значение для гипотенузы
//        double s = 0.5 * a * b;
//        double p = a + b + c;

        System.out.println("Площадь треугольника: " + (0.5 * a * b)
                + "\nПериметр треугольника: " + (a + b + c));
    }
}
