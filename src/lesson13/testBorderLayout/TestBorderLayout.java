package lesson13.testBorderLayout;

import javax.swing.*;
import java.awt.*;

public class TestBorderLayout {
    public static void main(String[] args) {
        var f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var panel = new JPanel();
        panel.setLayout(new BorderLayout());
        var b1 = new JButton("button1");
        var b2 = new JButton("button2");
        var b3 = new JButton("button3");
        var b4 = new JButton("button4");
        var b5 = new JButton("button5");
        panel.add(b1,BorderLayout.SOUTH);
        panel.add(b2,BorderLayout.CENTER);
        panel.add(b3,BorderLayout.WEST);
        panel.add(b4,BorderLayout.EAST);
        panel.add(b5,BorderLayout.NORTH);

        Container c = f.getContentPane();
        f.setPreferredSize(new Dimension(500, 500));
        f.pack();
        c.add(panel);
        f.setVisible(true);


    }
}
