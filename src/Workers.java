import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 27.01.12
 * Time: 12:09
 * To change this template use File | Settings | File Templates.
 */
public class Workers {
    public static void main(String[] args) {
        ArrayList<Employee> workers = new ArrayList<Employee>();
        workers.add(new Employee("Piter Pen", 5000, 1980, 12, 1));
        workers.add(new Employee("Adams Cock", 10000, 1982, 11, 1));
        
        Employee[] w = new Employee[5];
        w[0] = new Employee("Jhon Smidth", 5000, 1980, 12, 1);
        w[1] = new Employee("Antonio Banderas", 5000, 1992, 9, 2);
        w[2] = w[1];
        w[3] = new Manager("Bruce Willis", 10000, 1970, 9, 3);
        w[4] = new Employee("Jhon Smidth", 5000, 1980, 12, 1);


        for(int i = 0; i < w.length; i++)
            for(int y = i + 1; y < w.length; y++) {
                System.out.println(w[i] + "\n" + w[y]);
                System.out.println(w[i].equals(w[y]) + "\n");

            }

        Collections.addAll(workers, w);

        for(Employee e : workers)
            System.out.println(e);
        
        System.out.println();

        Collections.sort(workers);

        for(Employee e : workers)
            System.out.println(e);
                
    }
}
