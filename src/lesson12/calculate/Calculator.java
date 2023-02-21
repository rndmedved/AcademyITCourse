package lesson12.calculate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextArea textArea; //поле для ввода цифр.
    private int oper;


    private double number1 =0;
    private double number2 = 0;
    Calculator(){



        var c = getContentPane();
        var panel = new JPanel();
        panel.setLayout(new GridLayout(4,3));
        JButton buttons[] =  new JButton[18];
        var font = new Font("serif",Font.ITALIC, 15);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(font);
            buttons[i].setLocation(100, 50 + 30 * i);
            buttons[i].setSize(100, 25);
            buttons[i].setBackground(Color.DARK_GRAY);
            buttons[i].setForeground(Color.WHITE);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JButton button = (JButton) actionEvent.getSource();
                    String textButton = button.getText();
                    if(textButton.equalsIgnoreCase("Выход")){
                        System.exit(0);
                    } else if (textButton.equalsIgnoreCase("C")) {
                        textArea.setText("");
                        number1 = 0;
                        number2 = 0;
                    } else if (textButton.equalsIgnoreCase("=")) {
                        if(textArea.getText().equals("")) {
                            number2 =0;
                        }else{  number2 = Double.parseDouble(textArea.getText());}
                        switch (oper){
                            case 1: textArea.setText("" + (number1 + number2));
                                break;
                            case 2: textArea.setText("" + (number1 - number2));
                                break;
                            case 3: textArea.setText("" + (number1 * number2));
                                break;
                            case 4:{
                                if(number2 == 0){
                                    JOptionPane.showMessageDialog(null, "На ноль делить нельзя!");
                                }else {
                                    textArea.setText("" + (number1 / number2));
                                }

                            }

                        }
                    } else if(textButton.equalsIgnoreCase("+")){
                        number1 = Double.parseDouble(textArea.getText());
                        oper = 1;
                        textArea.setText("");
                    } else if(textButton.equalsIgnoreCase("-")){
                        number1 = Double.parseDouble(textArea.getText());
                        oper = 2;
                        textArea.setText("");
                    } else if(textButton.equalsIgnoreCase("*")){
                        number1 = Double.parseDouble(textArea.getText());
                        oper = 3;
                        textArea.setText("");
                    } else if(textButton.equalsIgnoreCase("/")){
                        number1 = Double.parseDouble(textArea.getText());
                        oper = 4;
                        textArea.setText("");
                    } else {
                        textArea.setText(textArea.getText() + textButton);
                    }
                }
            });
            panel.add(buttons[i]);
        }
        for (int i = 0; i < 10; i++) {
            buttons[i].setText(""+i);
        }
        buttons[10].setText("+");
        buttons[11].setText("-");
        buttons[12].setText("*");
        buttons[13].setText("/");
        buttons[14].setText("=");
        buttons[15].setText("C");
        buttons[16].setText(".");
        buttons[17].setText("Выход");


//        var res = new JLabel("Результат");
//        res.setFont(new Font("serif", Font.ITALIC|Font.BOLD, 30));
//        res.setBounds(130, 0, 300 , 50);
//        panel.add(res);

        textArea = new JTextArea();
        textArea.setFont(new Font("serif", Font.BOLD, 30));
        textArea.setBounds(300, 50, 300 , 35);
        panel.add(textArea, 0);
        c.add(panel);

        setSize(600, 600);
        setTitle("Медвед калькулятор.");
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
            new Calculator();
    }
}
