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
        createMenu();
       var container = getContentPane();
        JPanel head = new JPanel();
        head.setLayout(new GridLayout(1, 1));
        var foot = new JPanel();
        final boolean[] isChecked = {false, true};
        foot.setLayout(new GridLayout(5,3));
        JButton buttons[] =  new JButton[20];

        var font = new Font("serif",Font.ITALIC, 20);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setFont(font);

            buttons[i].setBackground(Color.DARK_GRAY);
            buttons[i].setForeground(Color.WHITE);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JButton button = (JButton) actionEvent.getSource();
                    String textButton = button.getText();
                    if (textButton.equalsIgnoreCase("Выход")) {
                        System.exit(0);
                    } else if (textButton.equalsIgnoreCase("C")) {
                        textArea.setText("");
                        number1 = 0;
                        number2 = 0;
                    } else if (textButton.equalsIgnoreCase("=")) {
                        isChecked[0] = true;
                        if (textArea.getText().equals("")) {
                            number2 = number1;
                        }else{
                            number2 = Double.parseDouble(textArea.getText());
                        }
                        switch (oper) {
                            case 1:
                                textArea.setText("" + (number1 + number2));
                                if(isChecked[1]) {
                                    swap();
                                    isChecked[1] = false;
                                }
                                break;
                            case 2:

                                if(isChecked[1]) {
                                    textArea.setText("" + (number1 - number2));
                                    swap();
                                    isChecked[1] = false;
                                } else textArea.setText("" + (number2 - number1));
                                break;
                            case 3:

                                textArea.setText("" + (number1 * number2));

                                if(isChecked[1]) {
                                    swap();
                                    isChecked[1] = false;
                                }
                                break;
                            case 4: {
                                if (number2 == 0) {
                                    JOptionPane.showMessageDialog(null, "На ноль делить нельзя!");
                                } else {

                                    if(isChecked[1]) {
                                        textArea.setText("" + (number1 / number2));
                                        swap();
                                        isChecked[1] = false;
                                    } else {
                                        textArea.setText("" + (number2 / number1));
                                    }
                                }
                                break;
                            }
                            case 5:

                                if(isChecked[1]) {
                                    textArea.setText(String.valueOf(Math.pow(number1,number2)));
                                    swap();
                                    isChecked[1] = false;
                                } else {
                                    textArea.setText(String.valueOf(Math.pow(number2,number1)));
                                }

                        }

                    } else if (textButton.equalsIgnoreCase("+")) {
                        if(!textArea.getText().equals("") || !textArea.getText().equals("-")) {
                            number1 = Double.parseDouble(textArea.getText());
                            oper = 1;
                            textArea.setText("");
                        }
                    } else if (textButton.equalsIgnoreCase("-")) {
                        if(textArea.getText().equals("")) {
                            textArea.setText("-");
                        } else if(!textArea.getText().equals("-")){
                            number1 = Double.parseDouble(textArea.getText());
                            oper = 2;
                            textArea.setText("");
                        }
                    } else if (textButton.equalsIgnoreCase("*")) {
                        if(!textArea.getText().equals("") || !textArea.getText().equals("-")) {
                            number1 = Double.parseDouble(textArea.getText());
                            oper = 3;
                            textArea.setText("");
                        }
                    } else if (textButton.equalsIgnoreCase("/")) {
                        if(!textArea.getText().equals("") || !textArea.getText().equals("-")) {
                            number1 = Double.parseDouble(textArea.getText());
                            oper = 4;
                            textArea.setText("");
                        }
                    }else if(textButton.equalsIgnoreCase("x^y")){
                        if(!textArea.getText().equals("") || !textArea.getText().equals("-")) {
                            number1 = Double.parseDouble(textArea.getText());
                            oper = 5;
                            textArea.setText("");
                        }
                    }else if(textButton.equalsIgnoreCase("\u221A")){
                        double number = Double.parseDouble(textArea.getText());
                        if (number < 0){
                            JOptionPane.showMessageDialog(null, "Нельзя взять корень из отрицательного числа.");
                        } else {
                            textArea.setText(String.valueOf(Math.sqrt(number)));
                        }
                    }else {
                        if(isChecked[0]){
                            textArea.setText("");
                            isChecked[0] = false;
                            textArea.setText(textArea.getText() + textButton);
                            isChecked[1] = true;
                        } else {
                            if(textArea.getText().equals("0")&&(!textButton.equals("."))){
                                textArea.setText(textButton);
                            }else if (!textButton.equals(".") || (!textArea.getText().contains("."))){
                                textArea.setText(textArea.getText() + textButton);
                            }
                        }
                    }
                }
            });
            foot.add(buttons[i]);
        }
        for (int i = 0; i < 10; i++) {
            buttons[i].setText(""+i);
        }

        buttons[12].setText("+");
        buttons[13].setText("-");
        buttons[14].setText("*");
        buttons[15].setText("/");
        buttons[18].setText("=");
        buttons[11].setText("C");
        buttons[10].setText(".");
        buttons[16].setText("\u221A");
        buttons[17].setText("x^y");
        buttons[19].setText("Выход");


        textArea = new JTextArea();
        textArea.setFont(new Font("serif", Font.BOLD, 30));
        textArea.setBounds(300, 50, 300 , 35);
        head.add(textArea);
        container.add(head, BorderLayout.NORTH);
        container.add(new JSeparator(), BorderLayout.CENTER);
        container.add(foot);

        setSize(400, 300);
        setTitle("Медвед калькулятор.");
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void createMenu() {
        Calculator currentCalculator = this;
        var menuBar= new JMenuBar();
        JMenu mainMenu = new JMenu("Меню");
        var font = new Font("serif", Font.BOLD, 15);
        mainMenu.setFont(font);
        var menuInner = new JMenu("О программе");
        mainMenu.add(menuInner);
        var item1 = new JMenuItem("Справка");
        var item2 = new JMenuItem("Авторы");
        item1.setFont(font);
        item2.setFont(font);
        menuInner.add(item1);menuInner.add(item2);
        mainMenu.addSeparator();
        var item4 = new JMenuItem("Выход");
        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabled(false);
                new Tutorial(currentCalculator).setVisible(true);
            }
        });
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setEnabled(false);
                new AboutAuthors(currentCalculator).setVisible(true);
            }
        });
        mainMenu.add(item4);
        menuBar.add(mainMenu);
        setJMenuBar(menuBar);

    }


    private void swap() {
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
    }

    public static void main(String[] args) {
            new Calculator();
    }
}
