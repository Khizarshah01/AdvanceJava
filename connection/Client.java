// A Java program for a Client
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
 
    // constructor to put ip address and port
    public Client(String address, int port, String name)
    {
        // establish a connection
        try {
            socket = new Socket(address, port);  
            System.out.println(" Connected!");

 
            // takes input from terminal
            input = new DataInputStream(System.in);
 
            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch (UnknownHostException u) {
            System.out.println(u);
            return;
        }
        catch (IOException i) {
            System.out.println(i);
            return;
        }
 
        // string to read message from input
        String line = "";
 
        try {
            name = "Connected:- " + name;
            out.writeUTF(name);
        } catch (IOException i) {}
        // keep reading until "Over" is input
        while (!line.equals("Over")) {
            try {
                line = input.readLine();
                out.writeUTF(line);
               
            }
            catch (IOException i) {
                System.out.println(i);
            }
        }
 
        // close the connection
        try {
            input.close();
            out.close();
            socket.close();
        }
        catch (IOException i) {
            System.out.println(i);
        }
    }
 
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your shitty name:- ");
         String name = sc.nextLine();
         Client client = new Client("172.16.3.245", 5000, name);
    }
}

