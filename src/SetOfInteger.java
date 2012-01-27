import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 21.01.12
 * Time: 0:37
 * To change this template use File | Settings | File Templates.
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);

        Set<Integer> setOfInteger = new HashSet<Integer>();

        for(int i = 0; i < 100; i++) {
            setOfInteger.add(rand.nextInt(30));

            Iterator<Integer> iterator = setOfInteger.iterator();

            while(iterator.hasNext()) {
                Integer integer = iterator.next();
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }
}
