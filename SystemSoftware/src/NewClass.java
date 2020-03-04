
import java.net.*;

class server 
{
    public static void main(String arg[])
    {
        try {
        ServerSocket server = new ServerSocket(3000);
        Socket s = server.accept();
        
        System.out.println("Connected");
    } catch (Exception e) {}
    }
}
