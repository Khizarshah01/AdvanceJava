import java.net.*;
import java.io.*;

class ARltry{
    public static void main(String[] args) throws MalformedURLException {
try {
    
    URL url = new URL("https://www.google.com");
    URLConnection urlcon = url.openConnection();
    InputStream stream = urlcon.getInputStream();
    
    int i;
    while((i=stream.read())!=-1){
        System.out.print((char) i);
    }
    stream.close();

    int lenght = urlcon.getContentLength();
    System.out.println(lenght);

    System.out.println(urlcon.getContentType());



    System.out.println(urlcon.getContentEncoding());


    System.out.println(urlcon.getURL());
} catch (Exception e){
    System.out.println(e.getMessage());
}
    }
}