import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client{
    public static void main(String[] args) throws IOException{
       Socket sock = new Socket("localhost", 4999);

       Scanner scan = new Scanner(System.in);
       PrintWriter printWrite = new PrintWriter(sock.getOutputStream());
       printWrite.println(scan.nextLine());
       printWrite.flush();
    
       InputStreamReader inputStream = new InputStreamReader(sock.getInputStream());
       BufferedReader bReader = new BufferedReader(inputStream);
       System.out.println("Server: " + bReader.readLine());
    }
}