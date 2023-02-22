package lesson11.task3.test_frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JLabel text1,text2, text3;
    JTextField field1, field2;
    JButton[] buttons;

    MyFrame(){
        setTitle("Тестовое окно");
        setSize(400,400);
        buttons = new JButton[4];
        setLocationRelativeTo(null);//для вывода окна по центру
//        setBounds(200,300,600,400);//для вывода окна с отступом от левого верхнего угла

        text1 = getLabel("Первое число");
        text2 = getLabel("Второе число");
        text3 = getLabel("Результат");

        field1 = new JTextField(10);
        field2 = new JTextField(10);

        buttons[0] = new JButton("+");
        buttons[1] = new JButton("-");
        buttons[2] = new JButton("*");
        buttons[3] = new JButton("/");
        Listener listener = new Listener();

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
//        Для размещения элементов в контейнере нужно выбрать менеджер размещения
//        Менеджер FlowLayout располагает элементы слева направо
        container.add(text1);
        container.add(field1);
        container.add(text2);
        container.add(field2);
        container.add(text3);

        for (JButton button : buttons) {
            button.addActionListener(listener);//добавили слушатель события
//        listener - это объект, который ожидает наступления события - клик мышки на кнопку
            container.add(button);

            setVisible(true);
        }

    }

    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Object resource = e.getSource();
            if(resource instanceof JButton){
                JButton button = (JButton) resource;
                switch (button.getText()){
                    case "+" -> text3.setText((field1.getText() + " + " + field2.getText() + " = "+
                            (Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText()))));
                    case "-" -> text3.setText((field1.getText() + " - " + field2.getText() + " = "+
                            (Integer.parseInt(field1.getText()) - Integer.parseInt(field2.getText()))));
                    case "*" -> text3.setText((field1.getText() + " * " + field2.getText() + " = "+
                            (Integer.parseInt(field1.getText()) * Integer.parseInt(field2.getText()))));
                    case "/" -> {
                        double d1 = Double.parseDouble(field1.getText());
                        double d2 = Double.parseDouble(field2.getText());
                        if (d2 == 0) {
                            JOptionPane.showMessageDialog(null, "На ноль делить нельзя.");
                        } else {
                            text3.setText(field1.getText() + " / " + field2.getText() + " = " + (d1/d2));
                        }
                    }

                }
            }
//            JOptionPane.showMessageDialog(null,"Привет!");
            int result = Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText());
        }
    }

    static JLabel getLabel(String text){
        var label = new JLabel(text);
        label.setFont(new Font("verdana",Font.BOLD|Font.ITALIC,20));
        label.setForeground(Color.GRAY);
        label.setToolTipText("Подсказка...");
        return label;
    }

    public static void main(String[] args) {
        var obj = new MyFrame();
    }
}
