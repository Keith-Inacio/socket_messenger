import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server{
    public static void main(String[] args) throws IOException{
        ServerSocket serverSock = new ServerSocket(4999);
        Socket sock = serverSock.accept();
        System.out.println("Client Connected");

        Scanner scan = new Scanner(System.in);

        InputStreamReader inputStream = new InputStreamReader(sock.getInputStream());
        BufferedReader bReader = new BufferedReader(inputStream);
        System.out.println("Client: " + bReader.readLine());

        PrintWriter printWrite = new PrintWriter(sock.getOutputStream());
        printWrite.println(scan.nextLine());
        printWrite.flush();
    }
}