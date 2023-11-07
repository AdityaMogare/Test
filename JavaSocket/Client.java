import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("Hello Server!");
            String response = in.readLine();
            System.out.println("Server response: " + response);
            in.close();
            out.close();
            socket.close();
        } catch (UnknownHostException e) {
            System.err.println("Host not found.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
