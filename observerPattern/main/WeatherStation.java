package observerPattern.main;

import observerPattern.observer.CurrentConditionsDisplay;
import observerPattern.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.registerObserver(currentDisplay);

        weatherData.setMEaurements(12, 13, 45);
        weatherData.setMEaurements(34, 75, 78);
        weatherData.setMEaurements(43, 76, 41);
    }
}
