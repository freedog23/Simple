package WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 06.02.12
 * Time: 5:34
 * To change this template use File | Settings | File Templates.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        CurrentConditionDisplay observer = new CurrentConditionDisplay();
        
        subject.registerObserver(observer);
        subject.setMeasurement(80, 65, 34.3f);
        subject.changeMeasurement();

    }
}
