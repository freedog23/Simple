import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 25.01.12
 * Time: 2:11
 * To change this template use File | Settings | File Templates.
 */
public class ForEachCollection {
    public static void main(String[] args) {
        Collection<String> ch = new LinkedList<String>();
        Collections.addAll(ch, "Take the long way home".split(" "));
        for(String s : ch)
            System.out.print(" '" + s + "' ");
    }
}
