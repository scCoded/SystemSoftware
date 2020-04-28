import java.net.*;
import java.io.*;

public class Server 
{
    
    public static void main(String args[]) throws IOException
    {
        ServerSocket server = null;
        try {
            server = new ServerSocket(3000);
            server.setReuseAddress(true);
            System.out.println("Waiting for client"); //when the server is first ran, this message is printed.         
            while(true)
            {  
                Socket client = server.accept();
                System.out.println("New client connected " + client.getInetAddress());
            }
         } catch (IOException e)
         {
             e.printStackTrace();
         }
        finally 
        {
            if (server != null)
            {
                try
                {
                server.close();
            }catch (IOException e)
                    {
                        e.printStackTrace();
                    }
        }
    }
}
}

class ClientHandler implements Runnable 
{
    private final Socket clientSocket;
    
    public ClientHandler(Socket socket) 
    {
        this.clientSocket = socket;
    }
    
    @Override
    public void run()
    {
        PrintWriter out = null;
        BufferedReader in = null;
        
        try 
        {
            out = new PrintWriter (clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String line;
            while ((line = in.readLine()) != null)
            {
                System.out.printf("Sent from the client; %s\n", line);
                out.println(line);
            }           
        }
                    catch (IOException e)
                    {
                    e.printStackTrace();
                    }
        finally
        {
            try
            {
                if (out != null)
                {
                    out.close();
                }
                if (in != null)
                {
                    in.close();
                    clientSocket.close();
                }   
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}


