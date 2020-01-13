import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client{
    public static void main(String[] args) throws IOException{
       Socket sock = new Socket("localhost", 4999);

       PrintWriter pr = new PrintWriter(sock.getOutputStream());
       pr.println("Hello");
       pr.flush();
    }
}