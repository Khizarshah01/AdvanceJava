import java.net.UnknownHostException;
import java.net.*;

public class Om {
    public static void main(String[] args) throws UnknownHostException {
          InetAddress ad = InetAddress.getLocalHost();
          System.out.println(ad.getByName("google.com"));
        System.out.println("Host Name "+ad.getHostName());
        System.out.println("Host address "+ad.getHostAddress());
        System.out.println("Address "+ad.toString());
        byte b[]=ad.getAddress();
        System.out.println("Ip adress");
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
    
    }
}
