package WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 06.02.12
 * Time: 3:06
 * To change this template use File | Settings | File Templates.
 */
public class CurrentConditionDisplay implements DisplayElement, WeatherObserver {
    private float temperature;
    private float humidity;
    private float pressure;

    /*private WeatherSubject subject;
    
    CurrentConditionDisplay(WeatherSubject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }*/

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Temerature: " + temperature
                + "\n" + "Humidity: " + humidity
                + "\n" + "Pressure: " + pressure);
    }
}
