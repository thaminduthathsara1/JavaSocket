package lk.ijse;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3002);

            System.out.println("Server is Started");

            Socket localSocket = serverSocket.accept();

            System.out.println("Request accepted");

            DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());

            String message = dataInputStream.readUTF();

            System.out.println("from client : "+message);

        }catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
