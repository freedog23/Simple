import sun.security.jca.GetInstance;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 10.02.12
 * Time: 14:19
 * To change this template use File | Settings | File Templates.
 */
interface GenFace<T> { T next(); }

class Coffee {
    private static int count = 0;
    private final long id = count++;
    public String toString() { return getClass().getSimpleName() + " " + id; }
}
class Latte extends Coffee {}
class Mocha extends Coffee {}
class Cappuccino extends Coffee {}
class Americano extends Coffee {}
class Breve extends Coffee {}

public class CoffeeGenerator implements GenFace<Coffee>, Iterable<Coffee>{
    private Class[] types = { Latte.class,
            Mocha.class, Cappuccino.class, Americano.class, Breve.class };
    private static Random random = new Random();
    private int size = 0;

    CoffeeGenerator() {}
    CoffeeGenerator(int sz) { size = sz; }

    public Coffee next() {
        try {
                return (Coffee)types[random.nextInt(types.length)].newInstance();
        
        } catch(Exception e) {
                throw new RuntimeException();
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        private int count = size;

        public boolean hasNext() { return count > 0; }
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
        public void remove() { throw new UnsupportedOperationException(); }
    }

    public Iterator<Coffee> iterator() { return new CoffeeIterator(); }


    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();

        for(int i = 0; i < 5; i++)
            System.out.print(gen.next() + " ");

        System.out.println();

        for(Coffee c : new CoffeeGenerator(5))
            System.out.print(c + " ");

    }
}
