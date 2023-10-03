import java.awt.*;
import java.awt.event.*;

public class TextListenerExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Text Listener Example");
        TextField textField = new TextField("Type something here", 20);

        // Create a TextListener
        TextListener textListener = new TextListener() {
            @Override
            public void textValueChanged(TextEvent e) {
                // This method is called when the text in the TextField changes
                String newText = textField.getText();
                System.out.println("Text changed to: " + newText);
            }
        };

        // Add the TextListener to the TextField
        textField.addTextListener(textListener);

        frame.add(textField);
        frame.setSize(300, 100);
        frame.setVisible(true);

     
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}
