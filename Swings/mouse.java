import java.awt.*;
import java.awt.event.*;

public class mouse extends Frame implements MouseListener, MouseMotionListener {

    public mouse() {
        addMouseListener(this);
        addMouseMotionListener(this);
        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse dragged to: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse moved to: " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new mouse();
    }

}
