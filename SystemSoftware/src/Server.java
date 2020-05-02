import java.net.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Server 
{
    private static ArrayList<ClientHandler> clients = new ArrayList<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(4);
    
    static Map<String, int[]> stationData;
        
    public static void main(String args[]) throws IOException
    {
        Server thisObj = new Server();
        thisObj.stationData = new HashMap<>();
        
        ServerSocket server = null;

        int[] data = {5,4,3,4,5};
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
        int[] data = {0,0,0,0,0} ;
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
        try 
        {
            System.out.println("station 1");
            
            String request;
            int inputInt;
            String inputString;
            int[] inputList;
            
            while ((request = in.readLine()) != null)
            {
                System.out.printf("Request from the client: %s\n", request);
                
                if (request.equals("getStationDataPoint2"))
                {
                    inputString = in.readLine();
                    inputInt = Integer.parseInt(in.readLine());
                    int output = Server.getStationDataPoint(inputString, inputInt);
                    out.println(output);
                }
                else if (request.equals("addStationData1"))
                {
                    inputString = in.readLine();
                    Server.addStationData(inputString);
                }
                else if (request.equals("addStationData2"))
                {
                    inputString = in.readLine();
                    //inputList = in.readLine();
                    Server.addStationData(inputString);
                }
                else if (request.equals("updateStationData3"))
                {
                    inputString = in.readLine();
                    inputInt = Integer.parseInt(in.readLine());
                    int newValue = Integer.parseInt(in.readLine());
                    Server.updateStationData(inputString, inputInt, newValue);
                }
                
                    
                    
                out.println(request);
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


