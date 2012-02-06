package WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 06.02.12
 * Time: 3:33
 * To change this template use File | Settings | File Templates.
 */
public class WeatherStation {
    public static void main(String[] args) {
/*
        WeatherData subject = new WeatherData();
        WeatherObserver observer = new CurrentConditionDisplay(subject);

        subject.setMeasurements(80, 65, 30.4f);
        System.out.println("=====================================");
        subject.removeObserver(observer);
        subject.setMeasurements(75, 60, 28.5f);
*/

        WeatherData subject = new WeatherData();
        WeatherObserver observer = new CurrentConditionDisplay();

        subject.registerObserver(observer);                // регистрация наблюдателя
        subject.setMeasurements(80, 65, 30.4f);            // отправка обновления параметров для наблюдаетей
        System.out.println("=====================================");
        subject.removeObserver(observer);                  // отписка наблюдателя
        subject.setMeasurements(75, 60, 28.5f);

    }
}
