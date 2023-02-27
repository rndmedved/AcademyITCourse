package lesson12.frameContinue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrame extends TemplateFrame {
    JTextField firstName;
    JLabel firstNameLabel, lastNameLabel, surnameLabel;
    JTextField lastName;
    JTextField surname;
    JButton button;

    public FirstFrame(String firstNameT, String lastNameT, String surnameT) {
        this.firstName = new JTextField(firstNameT, 20);
        firstNameLabel = new JLabel("Имя");
        lastNameLabel = new JLabel("отчество");
        surnameLabel = new JLabel("фамилия");
        this.lastName = new JTextField(lastNameT, 20);
        this.surname = new JTextField(surnameT,20);
        var container = getContentPane();
        container.setLayout(new GridLayout(4, 2));
        container.add(firstNameLabel);
        container.add(this.firstName);
        container.add(lastNameLabel);
        container.add(this.lastName);
        container.add(surnameLabel);
        container.add(this.surname);
        button = new JButton("->");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                setVisible(false); //Скрыли окно
                firstNameLabel.setText(lastName.getText());
//                new SecondFrame(
//                        firstName.getText().concat(" ").concat(
//                                lastName.getText()
//                        ).concat(" ").concat(
//                                surname.getText()
//                        )
//                ).setVisible(true);
            }
        });
        container.add(button);
        setVisible(true);

    }
}
