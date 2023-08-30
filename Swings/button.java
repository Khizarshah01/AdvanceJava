// import java.awt.*;

// public class button extends Frame {
//     Button ok, cancel;
//     button (String s) {
//         super(s);
//         setLayout(null);
//         setVisible(true);
//         setSize(500, 300);
//         ok = new Button("ok");
//         cancel = new Button("Cancel");
//         ok.setBounds(50, 50, 50, 50);
//         cancel.setBounds(120, 50, 100, 50);
//         add(ok);
//         add(cancel);
//     }
//     public static void main(String[] args) {
//         button b2 = new button("Frame demo");
//     }
// }

import java.awt.*;

public class button extends Frame {
    Button ok, cancel;
    button (String s) {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(500, 300);
        ok = new Button("ok");
        cancel = new Button("Cancel");
        ok.setBounds(50, 50, 50, 50);
        cancel.setBounds(120, 50, 100, 50);
        add(ok);
        add(cancel);
        if(ok.isEnabled()){
            Label l1 = new Label("hello");
            add(l1);
            ok.addActionListener(null);
        }
    }
    public static void main(String[] args) {
        button b2 = new button("Frame demo");
    }
}