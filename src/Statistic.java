import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 23.01.12
 * Time: 1:55
 * To change this template use File | Settings | File Templates.
 */
public class Statistic {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);

    }
}
