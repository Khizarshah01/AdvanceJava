// import java.util.Vector;

// import javax.swing.JComboBox;
// import javax.swing.JFrame;

// public class Jcombobox extends JFrame {
//     Jcombobox(){
//         Vector v = new Vector<>(50);
//         v.add("soalpur");
//         v.add("Pune");
//         v.add("sutala");
//         JComboBox a = new JComboBox(v);
//         add(a);
//         setLayout(null);
//         a.setBounds(50, 100, 80, 30); 
        
//     }
//     public static void main(String[] args) {
//         new Jcombobox();
//     }
// }

// import java.util.Vector;

// import javax.swing.JComboBox;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class Jcombobox  extends JFrame {
//     Jcombobox () {
//         Vector<String> v = new Vector<>();
//         v.add("soalpur");
//         v.add("Pune");
//         v.add("sutala");
//         JComboBox<String> comboBox = new JComboBox<>(v);
//         JLabel l1 = new JLabel("your are in "+comboBox.getSelectedItem());

        
//         add(comboBox);
//         add(l1);
//         setLayout(null);
//         comboBox.setBounds(50, 100, 80, 30);
//         setBounds(80, 100, 80, 30);
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(300, 200); // Set an appropriate size
//         setLocationRelativeTo(null); // Center the frame on the screen
//         setTitle("JComboBox Example"); // Set a title
//         setVisible(true); // Make the frame visible
//     }
    
//     public static void main(String[] args) {
//         new Jcombobox ();
//     }
// }




import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboboxExample extends JFrame {
    JComboboxExample() {
        Vector<String> v = new Vector<>();
        v.add("soalpur");
        v.add("Pune");
        v.add("sutala");
        JComboBox<String> comboBox = new JComboBox<>(v);
        
        JLabel l1 = new JLabel("You are in ");
        JLabel resultLabel = new JLabel();
        
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedValue = comboBox.getSelectedItem().toString();
                resultLabel.setText("You are in " + selectedValue);
            }
        });
        
        add(comboBox);
        add(resultLabel);
        setLayout(null);
        
        comboBox.setBounds(50, 50, 100, 30); // Adjusted bounds
        resultLabel.setBounds(50, 100, 150, 30); // Adjusted bounds
        
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JComboBox Example");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComboboxExample();
    }
}
