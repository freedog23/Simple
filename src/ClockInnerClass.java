import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class TalkingClock {
    private int interval;
    private boolean beep;
    
    TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    private class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("At the tone, the time is " + now);
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }

    public void start() {
        TimePrinter listener = new TimePrinter();
        Timer clock = new Timer(interval, listener);
        clock.start();
    }
}

public class ClockInnerClass {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();
        
        JOptionPane.showMessageDialog(null, "Do you want to quit?");
        System.exit(0);
    }
}