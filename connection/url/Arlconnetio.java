import java.io.*;
import java.net.*;

public class Arlconnetio {
    public static void main(String[] args) throws MalformedURLException {
        try {
            URL url = new URL("https://www.google.com"); // Corrected URL
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
            stream.close(); // Close the InputStream when done.
        
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
                    }
    }
}
