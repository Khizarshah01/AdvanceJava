import java.awt.*;
class sFra extends Frame
{
    sFra (String title)
    {
        super(title);
    }

}

class sFrame{
    public static void main(String[] args)
    {
        Frame f = new Frame("File Demomn");
        f.setVisible(true);
        f.setSize(300,300);

        FileDialog fd = new FileDialog(f,"File Dialog");
        fd.setVisible(true);
    }
}

