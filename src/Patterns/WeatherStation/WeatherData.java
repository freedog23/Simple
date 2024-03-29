package Patterns.WeatherStation;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 06.02.12
 * Time: 4:50
 * To change this template use File | Settings | File Templates.
 */
public class WeatherData implements WeatherSubject {
    private float temperature;
    private float humidity;
    private float pressure;
    
    private ArrayList<WeatherObserver> observers;

    WeatherData() { observers = new ArrayList<WeatherObserver>(); }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }
    
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for(WeatherObserver observer : observers)
            observer.update(temperature, humidity, pressure);
    }

    public void changeMeasurement() { notifyObserver(); }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
