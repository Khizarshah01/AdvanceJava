import java.io.*;
import java.net.*;

public class Arlconnetio {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.google.com");
            URL url = uri.toURL(); // Convert the URI to a URL
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
            stream.close(); // Close the InputStream when done.
        } catch (URISyntaxException e) {
            System.out.println("URI Syntax Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}
