import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class JindowListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Listener Example");
        frame.setSize(400, 300);

        // Create a window listener
        WindowListener windowListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window is closing");
                System.exit(0); // Exit the application when the window is closed
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window is activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window is deactivated");
            }
        };

        // Add the window listener to the frame
        frame.addWindowListener(windowListener);

        frame.setVisible(true);
    }
}
