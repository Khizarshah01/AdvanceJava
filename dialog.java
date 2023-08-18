import java.awt.*;
import java.awt.event.*;

public class dialog extends Dialog{
    dialog(Frame parent, String title){
        super (parent,title,false);
        setLayout(new FlowLayout());
        setSize(300,300);
        setBackground(Color.yellow);
        Button bd = new Button("Cancel");
        add(bd);
    }
        public static void main(String[] args){
            Frame F1 = new Frame();
        dialog h = new dialog(F1,"Dialog");
        h.setVisible(true);
    System.out.println("hello world");
}
}