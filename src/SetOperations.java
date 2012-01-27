import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 23.01.12
 * Time: 0:40
 * To change this template use File | Settings | File Templates.
 */
public class SetOperations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        set1.add("M");

        System.out.println(set1 + " character H " +
                (set1.contains("H") ? "is contains" : "is not contains"));
        System.out.println(set1 + " character M " +
                (set1.contains("N") ? "is contains" : "is not contains"));
        
        Set<String> set2 = new HashSet<String>();
        Collections.addAll(set2, "H I J K L".split(" "));

        System.out.println(set1 + " " + set2 + " " +
                (set1.containsAll(set2) ? 
                        "set2 is contains in set1" : "set2 is not contains in set1"));
        
        set1.remove("H");
        System.out.println(set1 + " " + set2 + " " +
                (set1.containsAll(set2) ?
                        "set2 is contains in set1" : "set2 is not contains in set1"));

        set1.removeAll(set2);
        System.out.println(set1 + " " + set2 + " set2 removed from set1 ");

        Collections.addAll(set1, "Y X Z".split(" "));
        System.out.println(set1 + " X Y Z added to set1");
    }
}
