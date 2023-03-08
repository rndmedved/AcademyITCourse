package lesson13.testRobot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class TestRobot {
//    Эмуляция действия пользователя.
    Robot robot;
    public TestRobot() throws AWTException {
        robot = new Robot();
        JFrame frame = new JFrame();
        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setLocation(0,0);
        frame.setLayout(new FlowLayout());
        JButton but[] = new JButton[3];
        Listener listener = new Listener();
        for (int i = 0; i < but.length; i++) {
            but[i] = new JButton();
            but[i].setName("btn" + i);
            but[i].addActionListener(listener);
            frame.add(but[i]);
        }
        but[0].setText("Поисковик");
        but[1].setText("Calculate");
        but[2].setText("smth else");
        frame.pack();
        frame.setVisible(true);
    }
    class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton button = (JButton) actionEvent.getSource();
            String titleBtn = button.getName();
            switch (titleBtn){
                case "btn0":
                    var builder = new ProcessBuilder("/usr/bin/google-chrome-stable", "https://yandex.ru");
                    try{
                        builder.start();
                    }catch (IOException e){
                        throw new RuntimeException(e);
                    }
            }
        }
    }

    public static void main(String[] args) throws AWTException {
        new TestRobot();
    }
}

