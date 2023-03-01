package lesson13.testComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TestComboBox extends JFrame {
    JComboBox<String> comboBox;
    TestComboBox(){
        var c = getContentPane();
        c.setLayout(new FlowLayout());
        comboBox = new JComboBox<>(new String[]{"red", "green", "blue"});
        c.add(comboBox);
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getSource() == comboBox){
                    if(itemEvent.getStateChange() == ItemEvent.SELECTED){
                        JOptionPane.showMessageDialog(null, comboBox.getSelectedItem());
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        new TestComboBox().setVisible(true);
    }
}
