import java.awt.*;
import java.awt.event.*;

public class Welcome {
    Welcome(){
        Frame f = new Frame("Hell");

        Label label = new Label("Enter a name");
        label.setBounds(100, 90, 180, 30);
        Button btn = new Button("click me");
        btn.setBounds(100, 180, 150, 30);
        TextField textField = new TextField();
        textField.setBounds(100, 120, 150, 30);
        Label label2 = new Label();
        label2.setBounds(100, 220, 180, 30);


        f.setSize(400, 600);
        f.setVisible(true);
        f.setLayout(null);

        f.add(btn);
        f.add(textField);
        f.add(label);
        f.add(label2);


        // Add ActionListener to the button
        btn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                // Actions to be performed when the button is clicked
                String name = textField.getText();
                label2.setBackground(Color.BLUE);
                label2.setText("Welcome "+name);              
                
            }
        });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
    }
 
    public static void main(String[] args) {
        Welcome a = new Welcome();   
    }
}
