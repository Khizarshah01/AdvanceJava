import javax.swing.*;
import java.awt.*;


public class PanelDemo  {

    public static void main(String[] args) {
  JFrame f = new JFrame();
  f.setSize(500,500);
  f.setVisible(true);

        f.setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(10,10));
        int b = 0;
        for(int i = 0;i<10;i++){
            for(int j=0;j<10;j++){
                jp.add(new JButton("Button"+b));
                ++b;
            }
        }
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jp,v,h);
        f.add(jsp,BorderLayout.CENTER);

    }
}