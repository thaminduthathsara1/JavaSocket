package lk.ijse;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket remoteSocket = new Socket("localhost",3002);

            DataOutputStream dataOutputStream = new DataOutputStream(remoteSocket.getOutputStream());

            dataOutputStream.writeUTF("Hello Server");

            dataOutputStream.flush();

            dataOutputStream.close();

            remoteSocket.close();
        }catch (IOException e) {
            throw new  RuntimeException(e);
        }
    }
}
