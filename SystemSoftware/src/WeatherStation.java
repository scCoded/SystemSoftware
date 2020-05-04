
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Random; 
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeatherStation extends Thread{
    private static String ID;
    private static int stationNumber;
    private static int[] gps = {0,0};
    private static int temperature;
    private static int humidity;
    private static int soilPH;
    private static int windSpeed;
    

    public static class MyThread extends Thread {

    @Override
    public void run(){
        WeatherStation w = new WeatherStation();
        w.startRunning();
        System.out.println("hi");
    }
  }
    
    
    WeatherStation(){
        
        
        
        
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
        boolean on = true;
        //thisObj.startRunning();
        

        
        ID = "station" + stationNumber;
        String host = "127.0.0.1";
        int port = 3000;
        try (Socket socket = new Socket("localhost", port))
        {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            printData();
            
            WeatherSensor sensor = new WeatherSensor();
            sensor.start();
            
            while(on) {
            String hello = ("addStationData2," + ID + "," + (gps[0]) + "," + (gps[1]) + "," + temperature + "," + humidity + "," + soilPH + "," + windSpeed);
            System.out.println(hello);
            out.println(hello);
            WeatherStation.sleep(12000);
            }

            scanner.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        } catch (InterruptedException ex) {
            Logger.getLogger(WeatherStation.class.getName()).log(Level.SEVERE, null, ex);
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

    public void setHumidity(int humidity) {
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

    public   void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
    
    public void startRunning() {
        new Timer(true).scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {
            randomUpdate();
        }   
    }, 0L, 10000L);
  } 
    public static void randomUpdate() {
        List<String> parameters = Arrays.asList("temperature", "humidity", "soilPH", "windSpeed");
        Random rand = new Random(); 
        String selectedParameter = parameters.get(rand.nextInt(parameters.size())); 
        if(selectedParameter == "temperature"){
            temperature = ((int)(Math.random() * 100));
        }
        if(selectedParameter == "humidity"){
            humidity = ((int)(Math.random() * 100));
        }
        if(selectedParameter == "soilPH"){
            soilPH = ((int)(Math.random() * 100));
        }
        if(selectedParameter == "windSpeed"){
            windSpeed = (int)(Math.random() * 100);
        }
    }
    



}

class WeatherSensor extends Thread {
    
    public void run(){
       System.out.println("My sensors are on now");
       try {
           
       while(true){
           
               WeatherStation.randomUpdate();
               WeatherSensor.sleep(10000);
           }
       
       } catch (InterruptedException ex) {
               Logger.getLogger(WeatherSensor.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
  }
