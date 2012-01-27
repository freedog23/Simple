import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonTestPanel extends JPanel {
    
    private class ColorHandler implements ActionListener {
        private Color color;
        
        ColorHandler(Color color) { this.color = color; }
        
        public void actionPerformed(ActionEvent e) {
            setBackground(color);
        }
    }
    
    ButtonTestPanel() {
        
        JButton yellowButton = new JButton("yellow");
        JButton blueButton = new JButton("blue");
        JButton redButton = new JButton("red");
        
        add(yellowButton);
        add(blueButton);
        add(redButton);
        
        ColorHandler yellowAction = new ColorHandler(Color.YELLOW);
        ColorHandler blueAction = new ColorHandler(Color.BLUE);
        ColorHandler redAction = new ColorHandler(Color.RED);
        
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
        
    }
}

public class ButtonTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setTitle("ButtonTest");
        frame.setLocation(screenSize.width / 4, screenSize.height / 4);
        frame.setSize(screenSize.width / 2, screenSize.height / 2);
        
        frame.add(new ButtonTestPanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}









/*
class ButtonPanel extends JPanel {

    private class ColorAction implements ActionListener {
        private Color background;

        ColorAction(Color background) { this.background = background; }

        public void actionPerformed(ActionEvent event) {
            setBackground(background);
        }
    }

    ButtonPanel() {
        JButton yellowButton = new JButton("yellow");
        JButton blueButton = new JButton("blue");
        JButton redButton = new JButton("red");

        add(yellowButton);
        add(blueButton);
        add(redButton);

        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redAction = new ColorAction(Color.RED);

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }
}

class ButtonFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    ButtonFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("ButtonTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setLocation(screenSize.width / 2, screenSize.height / 2);

        ButtonPanel panel = new ButtonPanel();
        add(panel);
    }
}

public class ButtonTest {
    public static void main(String[] args) {
        ButtonFrame frame = new ButtonFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
*/