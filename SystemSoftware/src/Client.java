import java.net.*;
class Client
{
    public static void main (String arg[])
    {
        try
        {
        Socket s = new Socket("localhost",3000);
        System.out.println("Connected!!");
        
        }catch(Exception e){}
        
    }
    
}
