import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

class MousePanel extends JPanel {
    private static final int SIDELENGTH = 10;
    
    private Rectangle2D current;
    private ArrayList<Rectangle2D> squares;
    
    MousePanel() {
        current = null;
        squares = new ArrayList<Rectangle2D>();
        
        addMouseListener(new MouseHandler());
        addMouseMotionListener(new MouseMotionHandler());
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        for(Rectangle2D square : squares) 
            ((Graphics2D)g).draw(square);
    }
    
    Rectangle2D find(Point2D point) {
        for(Rectangle2D square : squares) {
            if (square.contains(point))
                return square;
        }
        return null;
    }
    
    void add(Point2D point) {
        double x = point.getX();
        double y = point.getY();
        
        current = new Rectangle2D.Double(
                x - SIDELENGTH / 2, y - SIDELENGTH / 2,
                SIDELENGTH, SIDELENGTH
        );
        
        squares.add(current);
        
        repaint();
    }
    
    void remove(Rectangle2D rectangle) {
        if (rectangle == null) return;
        if (rectangle == current) current = null;
        
        squares.remove(rectangle);
        
        repaint();
    }
    
    private class MouseHandler extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {
            current = find(e.getPoint());
            if (current == null)
                add(e.getPoint());
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            current = find(e.getPoint());
            if (current != null && e.getClickCount() >= 2)
                remove(current);
        }
    }
    
    private class MouseMotionHandler extends MouseMotionAdapter {

        @Override
        public void mouseMoved(MouseEvent e) {
            setCursor(find(e.getPoint()) == null ?
                    Cursor.getDefaultCursor() :
                    Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR)
            );
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            double x = e.getX();
            double y = e.getY();
            
            current.setFrame(
                    x - SIDELENGTH / 2, y - SIDELENGTH / 2,
                    SIDELENGTH, SIDELENGTH
            );
            
            repaint();
        }
    }
}
public class MouseTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setTitle("MouseTest");
        frame.setLocation(screenSize.width / 4, screenSize.height / 4);
        frame.setSize(screenSize.width / 2, screenSize.height / 2);
        frame.add(new MousePanel());
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}