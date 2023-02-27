package lesson12.calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tutorial extends JFrame{
    Calculator calculator;

    JLabel textField = new JLabel("<HTML><h1 align = \"center\">Свойства калькулятора.</h1>" +
            "<p align = \"center\">1) калькулятор набирает число, следя за разделителем (точкой).<br>" +
            "Если точка на числе стоит, то еще одну точку поставить невозможно.<br>" +
            "2) Если стоит 0. При этом Вы без разделителя набираете цифры, то 0 убирается автоматически.<br>" +
            "3) В калькуляторе реализована функция += -= *= /= и ^=.<br>" +
            "То есть, если вы набираете число, жмете + и далее равно, то он складывает это число с самим собой.<br>" +
            "4) при многократном нажатии \" = \" калькулятор повторяет последнюю операцию с получившимся числом.<br>" +
            "5) Можно задавать отрицательные числа, поставив перед числом знак \" - \"<br>" +
            "6) Дорабатывать калькулятор можно еще долго. К примеру сделать проверку на Double <br>" +
            "или ввод чисесл и операций по нажатию клавиш. Однако и в данном виде им можно пользоваться.<br>" +
            "Уадчного использования программы!<br>" +
            "С уважением, Курагин Михаил.</p>");
    JButton button;
    Tutorial(Calculator calculator){
        this.calculator = calculator;
        setSize(750, 400);
        setResizable(false);
        button = new JButton("Закрыть справку");
        textField.setFont(new Font("Arial", Font.ITALIC, 14));
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                calculator.setEnabled(true);
            }
        });
        container.add(textField);
        container.add(button);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}

