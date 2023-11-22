
import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.javatpoint.com/java-tutorial");
            URL url = uri.toURL();
            URLConnection urlcon = url.openConnection();

            System.out.println("path " + url.getPath());
           System.out.println("protocol "+ url.getProtocol()); 
          System.out.println("port " + url.getPort());
          System.out.println("file "+ url.getFile());
          System.out.println("host "+ url.getHost());
          // Rest of your code...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

