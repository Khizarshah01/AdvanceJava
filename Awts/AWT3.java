import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AWT3 {
    AWT3(){
        Frame f = new Frame();
        Label l = new Label("hell world");
        Button b = new Button();
        TextField t = new TextField("jadu");

        l.setBounds(80, 40, 40, 20);
        b.setBounds(20, 80, 40, 20);
        t.setBounds(20, 40, 80, 20);

        f.add(l);
        f.add(b);
        f.add(t);

        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
    }
   public static void main(String[] args) {

   AWT3 a = new AWT3();    
   } 
}
