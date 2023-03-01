package lesson13.demoKeyBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DemoKeyBoard extends JFrame {
    String str = "";
    DemoKeyBoard(){
        setLayout(new FlowLayout());
        JTextField text = new JTextField();
        JLabel label = new JLabel();
        add(text); add(label);
        setSize(400, 400);
        text.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                str = e.getKeyCode() + " ";
                label.setText(str);
            }
        });
    }

    public static void main(String[] args) {
        new DemoKeyBoard().setVisible(true);
    }
}
