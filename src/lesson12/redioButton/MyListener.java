package lesson12.redioButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyListener implements ItemListener {
    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        JRadioButton rb = (JRadioButton) itemEvent.getSource();
        Font font = null;
        if(rb.isSelected()){
            font = new Font("verdana", Font.ITALIC,
                    Integer.parseInt(rb.getText()));

        }
    }
}
