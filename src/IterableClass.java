import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 25.01.12
 * Time: 3:01
 * To change this template use File | Settings | File Templates.
 */

public class IterableClass implements Iterable<String> {
    private int next = 0;
    private String[] words;
    
    IterableClass() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please, input your string:");
        words = in.nextLine().split(" ");
    }
    
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            public boolean hasNext() { return next < words.length; }
            public String next() { return words[next++]; }
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
    
    public static void main(String[] args) {
        IterableClass ic = new IterableClass();
        for(String s : ic)
            System.out.print("'" + s + "' ");
    }
}