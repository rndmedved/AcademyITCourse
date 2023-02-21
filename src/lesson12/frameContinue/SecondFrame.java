package lesson12.frameContinue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondFrame extends TemplateFrame {
    JTextField fioField;
    JButton button;
    SecondFrame(String fio){
        fioField = new JTextField(fio);
        button = new JButton("<-");
        var container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                String masFio[] = fio.split(" ");
                new FirstFrame(masFio[0],masFio[1], masFio[2]).setVisible(true);

            }
        });
        container.add(fioField);
        container.add(button);
    }
}
