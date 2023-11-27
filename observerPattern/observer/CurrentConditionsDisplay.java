package oberverPattern.observer;

import oberverPattern.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;


    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }


    
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
        
    }

    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();
    }


    
    public void display() {
        System.out.println("---------------------");
        System.out.println("Current Temperature: " + temperature);
        System.out.println("Current Humidity: " + humidity);
        System.out.println("Current Pressure: " + pressure);
        System.out.println("---------------------");
        
    }

    
}
