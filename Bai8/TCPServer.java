import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234); // Lắng nghe cổng 1234
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept(); // Chấp nhận kết nối từ client
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
            );
            String message = in.readLine();
            System.out.println("Received: " + message);

            in.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
