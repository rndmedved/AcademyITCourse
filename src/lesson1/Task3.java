package lesson1;

import javax.swing.JOptionPane;

public class Task3 {
    public static void main(String[] args) {
        int s = Integer.parseInt(JOptionPane.showInputDialog("Введите расстояние в метрах."));
        System.out.println("Расстояние в киллометрах = "+ (s/1000) + "км.");
    }
}
