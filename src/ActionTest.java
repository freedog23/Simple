import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

class ActionTestPanel extends JPanel {
    
    private class ColorHandler extends AbstractAction {
        ColorHandler(String name, Icon icon, Color color) {
            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, "set panel color to " + color);
            putValue("color", color);
        }

        public void actionPerformed(ActionEvent e) {
            setBackground((Color)getValue("color"));
        }
    }
    
    ActionTestPanel() {

        Action yellowAction = new ColorHandler("yellow", new ImageIcon("yellow.gif"), Color.YELLOW);
        Action blueAction = new ColorHandler("blue", new ImageIcon("blue.gif"), Color.BLUE);
        Action redAction = new ColorHandler("red", new ImageIcon("red.gif"), Color.RED);

        add(new JButton(yellowAction));
        add(new JButton(blueAction));
        add(new JButton(redAction));
        
        InputMap imap = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.CTRL_MASK), "panel.yellow");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_B, Event.CTRL_MASK), "panel.blue");
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R, Event.CTRL_MASK), "panel.red");

        ActionMap amap = getActionMap();
        
        amap.put("panel.yellow", yellowAction);
        amap.put("panel.blue", blueAction);
        amap.put("panel.red", redAction);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setTitle("ActionTest");
        frame.setLocation(screenSize.width / 4, screenSize.height / 4);
        frame.setSize(screenSize.width / 2, screenSize.height / 2);
        
        frame.add(new ActionTestPanel());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}