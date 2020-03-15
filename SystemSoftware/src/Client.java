import java.net.*;
import java.io.*;
import java.io.IOException;
import java.net.UnknownHostException;
import java.io.PrintWriter;
import java.io.BufferedReader;

class Client
{
    public static void main (String args[]) throws UnknownHostException, IOException
    {
        try{
            String name = args[0];
            Socket socket = new Socket("127.0.0.1",3000);

            BufferedReader bfClient = new BufferedReader(new InputStreamReader(socket.getInputStream())); //

            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            pw.println(name); //takes in the name of client connected.
            BufferedReader bfCommandPrompt = new BufferedReader(new InputStreamReader(System.in)); //takes terminal input msg

            while(true)
            {
                String readerInput = bfCommandPrompt.readLine();
                pw.println(name + ": " + readerInput); //prints message entered in server.

               System.out.println(bfClient.readLine()); //echoes message in server back to the client that sent it.

            }
        }catch(Exception e){}
    }      
}
