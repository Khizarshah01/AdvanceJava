import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TabelDemo{
    JFrame f;
    TabelDemo(){
        f = new JFrame();
        String rows[][]={
            {"07","OM","pass"},
            {"08","khizar","pass"},
            {"09","arshad","college Top"},
            {"10","akash","country top"}
        };
        String columns [] ={"Roll no","Name","status"};
        JTable jt = new JTable(rows,columns);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new TabelDemo();
    }
}