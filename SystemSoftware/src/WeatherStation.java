
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeatherStation extends Thread {

    private static String ID;
    private static int stationNumber;
    private static int[] gps = {0, 0};
    private static int temperature;
    private static int humidity;
    private static int windSpeed;
    private static int rainMeasurement;
    private static int visibility;
    private static int rainChance;



    WeatherStation() {

        this.stationNumber = (int) (Math.random() * 100);
        this.gps[0] = ((int) (Math.random() * 100));
        this.gps[1] = ((int) (Math.random() * 100));
        this.temperature = (int) (Math.random() * 100);
        this.humidity = (int) (Math.random() * 100);
        this.windSpeed = (int) (Math.random() * 100);
        this.rainMeasurement = (int) (Math.random() * 100);
        this.visibility = (int) (Math.random() * 100);
        this.rainChance = (int) (Math.random() * 100);
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public static void main(String args[]) throws UnknownHostException, IOException {
        WeatherStation thisObj = new WeatherStation();
        boolean on = true;
        //thisObj.startRunning();

        ID = "station" + stationNumber;
        String host = "178.62.9.119";
        int port = 3000;
        try (Socket socket = new Socket(host, port)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
            printData();

            WeatherSensor sensor = new WeatherSensor();
            sensor.start();

            while (on) {
                String hello = ("addStationData2," + ID + "," + (gps[0]) + "," + (gps[1]) + "," + temperature + "," + humidity + "," + windSpeed + "," +rainMeasurement + "," + visibility + "," + rainChance);
                System.out.println(hello);
                out.println(hello);
                WeatherStation.sleep(12000);
            }

            scanner.close();
        } catch (IOException e) {
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
        System.out.println("Wind Sp: " + WeatherStation.windSpeed);
        System.out.println("Rain measurement: " + WeatherStation.rainMeasurement);
        System.out.println("Visibility: " + WeatherStation.visibility);
        System.out.println("Chance of Rain : " + WeatherStation.rainChance);
        
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

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
    
    public int getRainMeasurement() {
        return rainMeasurement;
    }

    public void setRainMeasurement(int rainMeasurement) {
        WeatherStation.rainMeasurement = rainMeasurement;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        WeatherStation.visibility = visibility;
    }

    public int getRainChance() {
        return rainChance;
    }

    public void setRainChance(int rainChance) {
        WeatherStation.rainChance = rainChance;
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
        List<String> parameters = Arrays.asList("temperature", "humidity", "windSpeed", "rainMeasurement", "visibility", "rainChance");
        Random rand = new Random();
        String selectedParameter = parameters.get(rand.nextInt(parameters.size()));
        if (selectedParameter == "temperature") {
            temperature = ((int) (Math.random() * 100));
        }
        if (selectedParameter == "humidity") {
            humidity = ((int) (Math.random() * 100));
        }     
        if (selectedParameter == "windSpeed") {
            windSpeed = (int) (Math.random() * 100);
        }
        if (selectedParameter == "rainMeasurement") {
            windSpeed = (int) (Math.random() * 100);
        }
        if (selectedParameter == "visibility") {
            windSpeed = (int) (Math.random() * 100);
        }
        if (selectedParameter == "rainChance") {
            windSpeed = (int) (Math.random() * 100);
        }
        
    }

}

class WeatherSensor extends Thread {

    @Override
    public void run() {
        System.out.println("My sensors are on now");
        try {

            while (true) {

                WeatherStation.randomUpdate();
                WeatherSensor.sleep(10000);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(WeatherSensor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
