
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.Arrays;



public class WeatherStation {
    private static String ID;
    private static int stationNumber;
    private static int[] gps = {0,0};
    private static int temperature;
    private static int humidity;
    private static int soilPH;
    private static int windSpeed;
    
    WeatherStation(){
    
    //WeatherStation(int stationNumber,String gps,int temperature,double humidity,int soilPH,int windSpeed){
        /*
        this.stationNumber = stationNumber;
        this.gps = gps;
        this.temperature = temperature;
        this.humidity = humidity;
        this.soilPH = soilPH;
        this.windSpeed = windSpeed;
        */
        
        
        this.stationNumber = (int)(Math.random() * 100);
        this.gps[0] = ((int)(Math.random() * 100));
        this.gps[1] = ((int)(Math.random() * 100));
        this.temperature = (int)(Math.random() * 100);
        this.humidity = (int)(Math.random() * 100);
        this.soilPH = (int)(Math.random() * 100);
        this.windSpeed = (int)(Math.random() * 100);
    }
    
    public int getStationNumber() {
        return stationNumber;
    }
    
    public static void main (String args[]) throws UnknownHostException, IOException
    {
        WeatherStation thisObj = new WeatherStation();
        ID = "station" + stationNumber;
        String host = "127.0.0.1";
        int port = 3000;
        try (Socket socket = new Socket("localhost", port))
        {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
            String line = null;
            printData();
            String hello = ("addStationData2," + ID + "," + (gps[0]) + "," + (gps[1]) + "," + temperature + "," + humidity + "," + soilPH + "," + windSpeed);
            System.out.println(hello);
            out.println(hello);
            
            while (!"exit".equalsIgnoreCase(line))
            {
                line = scanner.nextLine();
                out.println(line);
                out.flush();
                System.out.println("Server replied " + in.readLine());
            }
            scanner.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }    
    
    public static void printData() {
        System.out.println("I am a weather startion with ID: " + WeatherStation.ID);
        System.out.println("GPS: " + Arrays.toString(WeatherStation.gps));
        System.out.println("Temp: " + WeatherStation.temperature);
        System.out.println("Hum: " + WeatherStation.humidity);
        System.out.println("Ph: " + WeatherStation.soilPH);
        System.out.println("Wind Sp: " + WeatherStation.windSpeed);
    }
    
    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public int[] getGps() {
        return gps;  
    }

    public void setGps(String gps) {
        //this.gps = gps;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        //this.humidity = humidity;
    }

    public int getSoilPH() {
        return soilPH;
    }

    public void setSoilPH(int soilPH) {
        this.soilPH = soilPH;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
}
