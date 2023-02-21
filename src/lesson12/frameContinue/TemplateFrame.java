package lesson12.frameContinue;

import javax.swing.*;

public class TemplateFrame extends JFrame {
    protected TemplateFrame(){
        setSize(400, 300);
        setTitle("Название чего-то там.");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
