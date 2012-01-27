import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 25.01.12
 * Time: 10:07
 * To change this template use File | Settings | File Templates.
 */
public class ArraysIsNotIterable {
    static<T> void print(Iterable<T> ib) {
        for(T t : ib)
            System.out.print("'" + t + "' ");
        System.out.println();
    }

    public static void main(String[] args) {
        print(Arrays.asList(1, 2, 3));
        String[] string = {"A", "B", "C"};
        print(Arrays.asList(string));
    }
}

