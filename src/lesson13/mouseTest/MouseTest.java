package lesson13.mouseTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseTest extends JFrame {
    JLabel label;
    JButton button;
    JTextArea textArea;
    MouseTest(){
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        label = new JLabel();
        button = new JButton("ok");
        textArea = new JTextArea(30, 100);
        container.add(label);
        container.add(textArea);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                var x =  e.getX();
                var y = e.getY();
                textArea.append("x = " + x + "; " + "y = "+ y+"\n");
            }
        });
        textArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Клик по мыши");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Ушли из наблюдаемой области.");
            }
        });
        container.add(button);

    }

    public static void main(String[] args) {
        new MouseTest().setVisible(true);
    }
}
