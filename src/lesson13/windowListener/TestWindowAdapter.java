package lesson13.windowListener;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindowAdapter extends JFrame {
    public TestWindowAdapter(){
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("DeActivated");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Activated");
            }
        });

    }

    public static void main(String[] args) {
        new TestWindowAdapter();
    }
}
