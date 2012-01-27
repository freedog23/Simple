import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;

class SketchPanel extends JPanel {
    private static final int LARGE_STEP = 5;
    private static final int SHORT_STEP = 1;
    
    private Point2D start;
    private ArrayList<Line2D> lines;
    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    SketchPanel() {
        start = new Point2D.Double(screenSize.width / 4, screenSize.height / 4);
        lines = new ArrayList<Line2D>();
        setFocusable(true);
        
        addKeyListener(new KeyHandler());
        
        Action refreshAction = new RefreshHandler("refresh");
        add(new JButton(refreshAction));
    
        InputMap imap = getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK), "button.refresh");
        ActionMap amap = getActionMap();
        amap.put("button.refresh", refreshAction);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for(Line2D line : lines) {
            ((Graphics2D)g).draw(line);
        }                                                                                      
    }
    
    private class RefreshHandler extends AbstractAction {
        RefreshHandler(String buttonName) { 
            putValue(Action.NAME, buttonName);
            putValue(Action.SHORT_DESCRIPTION, "press refresh button to clear screen");
        }
        
        public void actionPerformed(ActionEvent e) {
            lines.clear();
            start.setLocation(screenSize.width / 4, screenSize.height / 4);
            repaint();
        }
    }
    
    private void add(int x, int y) {
        Point2D end = new Point2D.Double(start.getX() + x, start.getY() + y);
        Line2D line = new Line2D.Double(start, end);
        lines.add(line);
        start = end; 
        
        repaint();
    }
    
    private class KeyHandler extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            int step;
            
            step = e.isShiftDown() ? LARGE_STEP : SHORT_STEP;
            
            if (keyCode == KeyEvent.VK_LEFT) add(-step, 0);
            else if (keyCode == KeyEvent.VK_RIGHT) add(step, 0);
            else if (keyCode == KeyEvent.VK_UP) add(0, -step);
            else if (keyCode == KeyEvent.VK_DOWN) add(0, step);
        }

        @Override
        public void keyTyped(KeyEvent e) {
            char keyChar = e.getKeyChar();
            int step;
            
            step = Character.isUpperCase(keyChar) ? LARGE_STEP : SHORT_STEP;
                
            if (keyChar == 'a' || keyChar == 'A') add(-step, 0);
            else if (keyChar == 'd' || keyChar == 'D') add(step, 0);
            else if (keyChar == 'w' || keyChar == 'W') add(0, -step);
            else if (keyChar == 's' || keyChar == 'S') add(0, step);
        }
    }
}
public class Sketch {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sketch");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(screenSize.width / 4, screenSize.height / 4);
        frame.setSize(screenSize.width / 2, screenSize.height / 2);
        SketchPanel sp = new SketchPanel();
        frame.add(sp);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}