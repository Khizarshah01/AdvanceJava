import java.awt.*;
import java.awt.event.*;

public class hello extends Frame{
    hello(){
    MenuBar mb = new MenuBar();
    setMenuBar(mb);
    Menu Files1 = new Menu("Files");
    Menu Files = new Menu("Colour");
    Menu save = new Menu("Save");
    Menu print = new Menu ("Print");
    Menu exit = new Menu ("Exits");

    MenuItem mi = new MenuItem("Blue");
    MenuItem mi1 = new MenuItem("violet");
    mb.add(Files1);
    mb.add(Files);
    mb.add(save);
    mb.add(print);
    mb.add(exit);

    Files.add(mi);
    Files.add(mi1);

    Files.add(new MenuItem ("Green"));
    Files.add(new MenuItem ("Black"));

    setTitle("Menubd");
    setSize(300,300);
    setVisible(true);

    // exit.addActionListener(new ActionListener(){
    //     public void actionPerformed(ActionEvent e){
    //         f.dispose();
    //     }
    // })
    }
    public static void main(String[] args){
        hello h = new hello();
    System.out.println("hello world");
}
}