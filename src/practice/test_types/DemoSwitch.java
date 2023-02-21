package practice.test_types;

import javax.swing.*;

public class DemoSwitch {
    public static void main(String[] args) {
        String[] options = {"Red", "Yellow", "Green"};

        int x = JOptionPane.showOptionDialog(null, "Choose traffic light color.",
                "click it! :)",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);
    }
    // Integer [] options = {1, 3, 5, 7, 9, 11};
// Double [] options = {3.141, 1.618};
// Character [] options = {'a', 'b', 'c', 'd'};
}

