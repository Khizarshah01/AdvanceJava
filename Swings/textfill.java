import java.awt.*;

public class textfill extends Frame {
    TextField t1;
    Label l1;
    textfill(String s){
        super (s);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        l1 = new Label ("enter user name");
        l1.setBounds(50,100,100,50);
        t1 = new TextField(12);
        t1.setBounds(150,100,100,50);
        add(l1);
        add(t1); 
    }
    public static void main(String[] args) {
        textfill tt = new textfill("fhjyuygfff bbv i jv ");
    }
}