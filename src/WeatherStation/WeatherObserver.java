package WeatherStation;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 06.02.12
 * Time: 4:32
 * To change this template use File | Settings | File Templates.
 */
public interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
}
