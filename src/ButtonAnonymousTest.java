import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonAnonymousPanel extends JPanel {
    
    void makeButton(String name, final Color color) {
        JButton button = new JButton(name);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(color);
            }
        });
    }
    
    ButtonAnonymousPanel() {
        makeButton("yellow", Color.YELLOW);
        makeButton("blue", Color.BLUE);
        makeButton("red", Color.RED);
    }
}
public class ButtonAnonymousTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ButtonAnonymousTest");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(screenSize.width / 4, screenSize.height / 4);
        frame.setSize(screenSize.width / 2, screenSize.height / 2);
        frame.add(new ButtonAnonymousPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}