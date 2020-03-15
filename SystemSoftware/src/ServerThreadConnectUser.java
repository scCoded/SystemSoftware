import java.net.*;
import java.io.*;

public class ServerThreadConnectUser extends Thread 
{
    Socket socket;
    ServerThreadConnectUser(Socket socket)
    {
        this.socket = socket;
    }
    public void run()
    {
        try{
            String message = null;
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            
            InputStreamReader in = new InputStreamReader(socket.getInputStream());
            BufferedReader bf = new BufferedReader(in);
            
            System.out.println(bf.readLine() + " is now connected to server"); //prints the name of client connected.
            while((message = bf.readLine())!=null)
            {
               System.out.println("Incoming message: " + message); //server prints connected clients msg
               pw.println("Server echoing Client message=======>" + message); //server echoes back connected clients msg.
            }
            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
    
}