import javax.swing.*;

public class LangPdemo extends JApplet {
    public void init() {
        JTabbedPane jtp = new JTabbedPane();
        jtp.addTab("Languages", new LangPanel());
        jtp.addTab("color", new ColorsPane());
        jtp.addTab("Flavors", new FlavorsPane());
        add(jtp);
    }
}

class ColorsPane extends JPanel {
    public ColorsPane() {
        JCheckBox cb1 = new JCheckBox("red");
        JCheckBox cb2 = new JCheckBox("blue");
        JCheckBox cb3 = new JCheckBox("yellow");
        add(cb1);
        add(cb2);
        add(cb3);

    }

}

class LangPanel extends JPanel {

    public LangPanel() {
        JButton j1 = new JButton("marathi");
        JButton j2 = new JButton("hindi");
        JButton j3 = new JButton("tamil");
        JButton j4 = new JButton("bengali");
        add(j1);
        add(j2);
        add(j3);
        add(j4);

    }
}

class FlavorsPane extends JPanel {
    public FlavorsPane() {
        JComboBox jcb = new JComboBox();
        jcb.addItem("vanilla");
        jcb.addItem("chocolate");

        jcb.addItem("straberry");
        add(jcb);
    }
}