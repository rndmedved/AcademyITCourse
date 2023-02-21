package lesson11.swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.http.WebSocket;

public class MyNewFrame extends JFrame{
    JLabel text1, text2;
    JTextField field1, field2;
    JButton button;

    public static void main(String[] args) {
        MyNewFrame myNewFrame = new MyNewFrame();
    }

    MyNewFrame(){
        setTitle("Frame");
        setSize(400, 300);
        setLocationRelativeTo(null); //Инструкция для вывода окна по центру.
//        setBounds(100, 100 , 600, 400);
        setVisible(true);
        text1 = getLabel("First number");
        text2 = getLabel("second number");

        field1 = new JTextField(10);
        field2 = new JTextField(10);

        button = new JButton("Ok");
        Listener listener = new Listener(); //getSource()
        button.addActionListener(listener);

        Container container = getContentPane(); //Предоставляет контейнер, в который будем помещать обхекты
//        Для размещения элементов в контейнере нужно выбраь менеджер размещения
//        Менеджер FlawLayout распологает элементы слева направа.
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); //BoxLayout GridLayout
        container.add(text1);
        container.add(field1);
        container.add(text2);
        container.add(field2);
        container.add(button);
    }
    static JLabel getLabel(String text){
        JLabel label = new JLabel(text);
        label.setFont(new Font("verdana", Font.BOLD|Font.ITALIC, 20));
        label.setForeground(Color.BLUE);
        label.setToolTipText("Подсказка...");
        return label;
    }

    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
//        JOptionPane.showMessageDialog(null, "button was pressed!");
            int result = Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText());
            text1.setText(result + "");
        }

    }


}
