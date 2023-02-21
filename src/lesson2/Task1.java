package lesson2;

import javax.swing.*;

/*
    Написать программу определения стоимости разговора по телефону с учетом
    скидки 20%, предоставляемой по субботам и воскресеньям
*/
public class Task1 {
    final static double discount = 20;
    public static void main(String[] args) {
        String exceptionMessage = "Введенные данные некорректны. Извините. Расчет стоимости звонка невозможен.";
        double callCost = Double.parseDouble(JOptionPane.showInputDialog("Введите стоимость минуты звонка."));
        int time = Integer.parseInt(JOptionPane.showInputDialog("Введите время разговора в минутах."));
        int day = Integer.parseInt(JOptionPane.showInputDialog("Введите день недели."));
        if (day <= 0 || day > 7) {
            System.out.println("Введен некоректный день недели.");
            JOptionPane.showMessageDialog(null, exceptionMessage);
        } else if (time > 60*24){
            System.out.println("Введено некоректное время разговора. В сутках - "+ (60*24) + " минут.");
            JOptionPane.showMessageDialog(null, exceptionMessage);
        } else if (callCost < 0){
            System.out.println("Введена некоректная стоимсть.");
            JOptionPane.showMessageDialog(null, exceptionMessage);
        }
        else if (day < 6) {
            JOptionPane.showMessageDialog(null, "Стоимость звонка составила - " +
                    (time * callCost) + " руб.");
        } else {
            JOptionPane.showMessageDialog(null, "Стоимость звонка составила - " +
                    (time * callCost * (1 - discount / 100)) + " руб.");
        }
    }
}
