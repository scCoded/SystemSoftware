import java.net.*;
import java.io.*;

class Server 
{
    
    public static void main(String args[]) throws IOException
    {
        int port = 3000;
        
        try {
            ServerSocket Server = new ServerSocket(port);
            System.out.println("Waiting for client"); //when the server is first ran, this message is printed.
            
            while(true)
            {
                Socket s = Server.accept();
                new ServerThreadConnectUser(s).start();
            }
         } catch (Exception e) {}
    }
}


