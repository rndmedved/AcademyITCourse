package lesson12.redioButton;

import lesson12.frameContinue.TemplateFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.*;
import java.util.List;

public class TestRadioButtons extends TemplateFrame {
    JRadioButton rb1, rb2, rb3;
    JCheckBox cb1, cb2, cb3;
    JLabel text;
    TestRadioButtons(){
        setTitle("Пример использования радио-кнопок");
        text = new JLabel("Какой-то текст");
        rb1 = new JRadioButton("10");
        rb2 = new JRadioButton("20");
        rb3 = new JRadioButton("30");

        cb1 = new JCheckBox("Курсив");
        cb2 = new JCheckBox("Жирный");
        cb3 = new JCheckBox("Обычный");
        List<JRadioButton> listRadio = new ArrayList<>();
        Collections.addAll(listRadio, rb1, rb2, rb3);
//        Делается в связке с объектом buttonGroup()
        ButtonGroup group = new ButtonGroup();
        group.add(rb1); group.add(rb2); group.add(rb3);
        var c = getContentPane();
        c.setLayout(new FlowLayout());
        var listener = new MyListener();
        for (JRadioButton jRadioButton : listRadio) {
            jRadioButton.addItemListener(listener);
            c.add(jRadioButton);
        }
        c.add(cb1); c.add(cb2); c.add(cb3);
        cb1.addItemListener(listener);
        cb2.addItemListener(listener);
        cb3.addItemListener(listener);
        c.add(text);
    }
    public class MyListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent itemEvent) {
            var object = itemEvent.getSource();
            if(object instanceof JCheckBox){
                JOptionPane.showMessageDialog(null, "smth");
            }else if(object instanceof JRadioButton){
                JRadioButton rb = (JRadioButton) object;
                Font font = null;
                if(rb.isSelected()){
                    font = new Font("verdana", Font.ITALIC,
                            Integer.parseInt(rb.getText()));
                    text.setFont(font);
                }
            }


        }
    }

    public static void main(String[] args) {
        new TestRadioButtons().setVisible(true);
    }
}
