import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

class TalkingAnonymousClock {
    
    void start(int interval, final boolean beep) {
        ActionListener listener =
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Date now = new Date();
                        System.out.println("At the tone, the time is " + now);
                        if (beep) Toolkit.getDefaultToolkit().beep();
                    }
                };
        Timer clock = new Timer(interval, listener);
        clock.start();
    }
}

public class ClockAnonymousInnerClass {
    public static void main(String[] args) {
        TalkingAnonymousClock clock = new TalkingAnonymousClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Do you want to quit?");
        System.exit(0);
    }
}