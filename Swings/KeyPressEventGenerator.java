import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyPressEventGenerator extends JFrame implements KeyListener {
    private JLabel messageLabel;

    public KeyPressEventGenerator() {
        setTitle("Key Press Event Generator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        messageLabel = new JLabel("Press a key...");
        panel.add(messageLabel);

        add(panel);
        addKeyListener(this);
    }

    public static void main(String[] args) {
        KeyPressEventGenerator frame = new KeyPressEventGenerator();
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key Typed: "+ KeyEvent.getKeyText(e.getKeyCode()));
         }

    @Override
    public void keyPressed(KeyEvent e) {
        // This method is invoked when a key is pressed down.
        System.out.println("key pressed: "+ KeyEvent.getKeyText(e.getKeyCode()));
        messageLabel.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // This method is invoked when a key is released.
        // We don't use it in this example.
        System.out.println("Key relased: "+ KeyEvent.getKeyText(e.getKeyCode()));
    }
}

