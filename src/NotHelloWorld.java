import javax.swing.*;
import java.awt.*;

class NotHelloWorldPanel extends JPanel {
        private static int MESSAGE_X;
        private static int MESSAGE_Y;

    NotHelloWorldPanel() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        MESSAGE_X = screenSize.width / 5;
        MESSAGE_Y = screenSize.height / 5;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawString("Not a Hello World programm", MESSAGE_X, MESSAGE_Y);
    }

}
class NotHelloWorldFrame extends JFrame {

    NotHelloWorldFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("Not a hello world programm");
        setLocation(screenSize.width / 4, screenSize.height / 4);
        setSize(screenSize.width / 2, screenSize.height / 2);
        setIconImage(Toolkit.getDefaultToolkit().getImage("ball.gif"));

        NotHelloWorldPanel panel = new NotHelloWorldPanel();
        add(panel);
    }
}
public class NotHelloWorld {
    public static void main(String[] args) {
        NotHelloWorldFrame frame = new NotHelloWorldFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
