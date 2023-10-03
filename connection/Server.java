import java.io.*;
import java.net.*;

public class MultiThreadedServer {
    private ServerSocket serverSocket;

    public MultiThreadedServer(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started");

            // continuously listen for new client connections
            while (true) {
                Socket socket = serverSocket.accept();
                // String name = socket.getInetAddress().getHostName();
                // System.out.println(name + " New client connected");

                // create a new thread to handle the client
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MultiThreadedServer server = new MultiThreadedServer(5000);
    }
}

class ClientHandler implements Runnable {
    private Socket socket;
    private DataInputStream in;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String line = "";

        // reads message from client until "Over" is sent
        try {
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);
                } catch (IOException i) {
                    System.out.println(i);
                }
            }

            System.out.println("Closing connection");

            // close connection
            socket.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
