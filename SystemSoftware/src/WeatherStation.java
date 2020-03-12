
public class WeatherStation {
    private int stationNumber;
    private String gps;
    private int temperature;
    private double humidity;
    private int soilPH;
    private int windSpeed;
    
        WeatherStation(){}
    
    WeatherStation(int stationNumber,String gps,int temperature,double humidity,int soilPH,int windSpeed){
        this.stationNumber = stationNumber;
        this.gps = gps;
        this.temperature = temperature;
        this.humidity = humidity;
        this.soilPH = soilPH;
        this.windSpeed = windSpeed;
    }
    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
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
        this.humidity = humidity;
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
