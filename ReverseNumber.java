import java.awt.*;
import java.awt.event.*;

public class ReverseNumber {
    ReverseNumber(){
        Frame frame = new Frame("Reverse a number");

        Button btn = new Button("Reverse");
        btn.setBounds(100, 100, 80, 30);

        TextField textField = new TextField();
        textField.setBounds(100, 70, 80, 30);

        Label label = new Label();
        label.setBounds(100, 130, 80, 30);

        
        frame.setSize(500, 600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(btn);
        frame.add(textField);
        frame.add(label);

        btn.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String string = textField.getText();
                String string2 = Reverse(string);
                label.setText(string2);
            }
    });

}

public String Reverse(String input){
    if(input == null || input.isEmpty())
    {
        return "Wrong input!";
    }

    char[] stringArr = input.toCharArray();
    int l = stringArr.length;
    char[] reverseArr = new char[l];

    for(int i = 0; i<l ; i++)
    {
        reverseArr[i] = stringArr[l-i-1];
    }
    return String.valueOf(reverseArr);
}
    public static void main(String[] args) {
        ReverseNumber r = new ReverseNumber();        
    }
    
}
