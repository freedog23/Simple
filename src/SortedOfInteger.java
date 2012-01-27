import java.util.Random;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 21.01.12
 * Time: 4:17
 * To change this template use File | Settings | File Templates.
 */
public class SortedOfInteger {
    public static void main(String[] args) {
        Random random = new Random();

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for(int i = 0; i < 25; i++)
            treeSet.add(random.nextInt(25));
        
        System.out.println(treeSet);
    }
}
