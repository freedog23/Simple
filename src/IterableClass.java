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
    private int index = 0;
    private String[] words;

    IterableClass() {
        System.out.print("Input your string: ");
        Scanner in = new Scanner(System.in);
        words = in.nextLine().split(" ");
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() { return index < words.length; }

            @Override
            public String next() { return words[index++]; }

            @Override
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }

    public static void main(String[] args) {
        for(String s : new IterableClass())
            System.out.print("'" + s + "' ");
    }
}