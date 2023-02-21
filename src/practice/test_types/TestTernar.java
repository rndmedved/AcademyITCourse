package practice.test_types;

import javax.swing.*;

public class TestTernar {
    public static void main(String[] args) {

        int numberOfDay = Integer.parseInt(JOptionPane.showInputDialog("введите номер дня"));
        System.out.println(numberOfDay < 6? "Будний день": "Выходной");
    }
}
