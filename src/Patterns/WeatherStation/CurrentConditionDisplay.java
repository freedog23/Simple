package Patterns.WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 06.02.12
 * Time: 5:20
 * To change this template use File | Settings | File Templates.
 */
public class CurrentConditionDisplay implements WeatherObserver, WeatherDisplay {
    private float temperature;
    private float humidity;
    private float pressure;

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    
    public void display() {
        System.out.print("temperature: " + temperature
                + " humidity: " + humidity
                + " pressure: " + pressure);
    }
}
