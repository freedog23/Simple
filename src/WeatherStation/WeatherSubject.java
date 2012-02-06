package WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 06.02.12
 * Time: 2:01
 * To change this template use File | Settings | File Templates.
 */
public interface WeatherSubject {
    void registerObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObserver();
}
