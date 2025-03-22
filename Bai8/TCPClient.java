import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Kết nối tới Server theo IP và cổng
            Socket socket = new Socket("192.168.10.10", 1234);

            PrintWriter out = new PrintWriter(
                socket.getOutputStream(), true
            );
            out.println("Hello from Client!");

            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
