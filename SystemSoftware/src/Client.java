import java.net.*;
import java.io.*;
import java.io.IOException;
import java.net.UnknownHostException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.util.Scanner;

class Client
{
    public static void main (String args[]) throws UnknownHostException, IOException
    {
        String host = "127.0.0.1";
        int port = 3000;
        try (Socket socket = new Socket(host, port))
        {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
            String line = null;
            loginPage.main(args);
            while (!"exit".equalsIgnoreCase(line))
            {
                line = scanner.nextLine();
                out.println(line);
                out.flush();
                System.out.println("Server replied " + in.readLine());
            }
            scanner.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }      
}
