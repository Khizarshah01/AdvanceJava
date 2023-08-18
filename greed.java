import java.awt.*;
import java.awt.event.*;

public class greed extends Frame{

greed(){
    MenuBar mb = new MenuBar();
    setMenuBar(mb);
    Menu Files = new Menu("colour");
    Menu exit = new Menu ("Exits");
    mb.add(Files);
    mb.add(exit);

    setTitle("Menubd");
    setSize(300,300);
    setVisible(true);

}
public static void main(String[] args){
    System.out.println("hello world");
    greed g = new greed();
}
}