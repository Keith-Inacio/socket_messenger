import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server{
    public static void main(String[] args) throws IOException{
        ServerSocket serverSock = new ServerSocket(4999);
        Socket sock = serverSock.accept();
        System.out.println("Client Connected");

        InputStreamReader inputStream = sock.getInputStream();
        BufferedReader bReader = new BufferedReader(inputStream);
        System.out.println("Client: " + bReader.read());
    }
}