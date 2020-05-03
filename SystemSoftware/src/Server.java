import java.net.*;
import java.io.*;
import java.lang.System.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

public class Server 
{
    private static ArrayList<ClientHandler> clients = new ArrayList<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(10);
    
    public static Map<String, int[]> stationData;
        
    public static void main(String args[]) throws IOException
    {
        Server thisObj = new Server();
        thisObj.stationData = new HashMap<>();
        
        ServerSocket server = null;

        int[] data = {5,4,3,4,5,4,5,6};
        thisObj.addStationData("station1", data);
        
        int stationData[] = thisObj.getStationData("station1");
        System.out.println("data for station" + java.util.Arrays.toString(stationData));

        updateStationData("station1",0,420);
        int stationDataUpdated[] = thisObj.getStationData("station1");      
        System.out.println("data for station" + java.util.Arrays.toString(stationDataUpdated));
        
        try {
            server = new ServerSocket(3000);
            server.setReuseAddress(true);
            System.out.println("Server started"); //when the server is first ran, this message is printed.         
            while(true)
            {
                System.out.println("Waiting for client");
                Socket client = server.accept();
                System.out.println("New client connected " + client.getInetAddress());
                ClientHandler clientThread = new ClientHandler(client);
                clients.add(clientThread);
                
                pool.execute(clientThread);
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
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void addStationData(String key)
    {
        int[] data = {0,0,0,0,0,0,0,0,0,0} ;
        addStationData(key, data);
    }
    
    public static void addStationData(String key, int[] data)
    {
        stationData.put(key, data);
        System.out.println("slot for ID " + key + " has been added to the server map");  
    }
    
    public static void setStationData(String key, int[] data)
    {
        stationData.replace(key, data);
        System.out.println("slot for ID " + key + " has been updated in the server map");  
    }
    
    public static void updateStationData(String key, int index, int newValue)
    {
        int[] newData = stationData.get(key);
        newData[index] = newValue; 
        stationData.replace(key, newData);
        System.out.println("data for ID " + key + " at " + index + "has been updated in the server map");
    }
    
    public static int[] getStationData(String key)
    {
        int[] data = stationData.get(key);
        return data;
    }
    
    
    public static int getStationDataPoint(String key, int index)
    {
        int data = stationData.get(key)[index];
        return data;
    }
    
    
    
    
    
}



class ClientHandler implements Runnable 
{
    private Socket client;
    private BufferedReader in;
    private PrintWriter out;
    
    public ClientHandler(Socket clientSocket) throws IOException 
    {
        this.client = clientSocket;
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new PrintWriter(client.getOutputStream(), true);   
    }
    
    
    @Override
    public void run()
    {
        System.out.printf("Thread begun:");
        try 
        {
            System.out.printf("Waiting for request: ");
            
            String request;
            String[] requestArray = {};
            
            while ((request = in.readLine()) != null)
            {
                System.out.printf("Request from the client: ", request);
                requestArray = request.split(",");
                
                
                
                if (requestArray[0].equals("getStationDataPoint2"))
                {
                    String key = requestArray[1];
                    int index = Integer.parseInt(requestArray[2]);
                    int output = Server.getStationDataPoint(key, index);
                    out.println(output);
                }
                else if (requestArray[0].equals("getStationData1"))
                {
                    String key = requestArray[1];
                    int[] output = Server.getStationData(key);
                    out.println(Arrays.toString(output));
                }
                else if (requestArray[0].equals("addStationData1"))
                {
                    String key = requestArray[1];
                    Server.addStationData(key);
                }
                else if (requestArray[0].equals("addStationData2"))
                {
                    String key = requestArray[1];
                    int[] data = {Integer.parseInt(requestArray[2]),
                        Integer.parseInt(requestArray[3]),
                        Integer.parseInt(requestArray[4]),
                        Integer.parseInt(requestArray[5]),
                        Integer.parseInt(requestArray[6]),
                        Integer.parseInt(requestArray[7])
                        };
                    Server.addStationData(key, data);
                }
                else if (requestArray[0].equals("updateStationData3"))
                {
                    String key = requestArray[1];
                    int index = Integer.parseInt(requestArray[2]);
                    int newValue = Integer.parseInt(requestArray[3]);
                    Server.updateStationData(key, index, newValue);
                }
                else if (requestArray[0].equals("requestAllStationData"))
                {
                    Iterator it = Server.stationData.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry pair = (Map.Entry)it.next();
                        String key = (String)pair.getKey();
                        int[] values = (int[])pair.getValue();
                 
                        String hello = ("updateStationData," + key + "," + values[0] + "," + values[1] + "," + values[2] + "," + values[3] + "," + values[4] + "," + values[5]);
                        out.println(hello);
                        it.remove(); // avoids a ConcurrentModificationException
                    }
                    
                    
                    
                }
                else
                {
                    out.println("request not found");
                }
                
                    
                
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
                    client.close();
                }   
            }catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}


