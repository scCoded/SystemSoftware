/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.*;

/**
 *
 * @author jakub
 */
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
