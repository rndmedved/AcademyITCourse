package lesson12.calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AboutAuthors extends JFrame {
    Calculator calculator;

    JLabel textField = new JLabel("<HTML><p align = \"center\">Автор данного калькулятора<br>" +
            "Курагин Михаил Михайлович.<br>" +
            "Создан на основе калькулятора<br>" +
            "Герасименко Сергея Валерьевича.<br>" +
            "Курс: разработка бизнес приложений<br>" +
            "в среде Java и Spring.</p></HTML>");
    JButton button;
    AboutAuthors(Calculator calculator){
        this.calculator = calculator;
        setSize(370, 250);
        setResizable(false);
        button = new JButton("Закрыть информацию");
        textField.setFont(new Font("Arial", Font.ITALIC, 20));
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
