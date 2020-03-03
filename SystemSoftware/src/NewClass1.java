/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.*;
class client
{
    public static void main (String arg[])
    {
        try
        {
        Socket s = new Socket("127.0.0.1",3000);
        System.out.println("Connected!!");
        
        }catch(Exception e){}
        
    }
    
}
