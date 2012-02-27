/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 09.02.12
 * Time: 19:20
 * To change this template use File | Settings | File Templates.
 */

public class LinkedStack<T> {
    private static class Nude<U> {
        private U item;
        private Nude<U> next;

        Nude() { item = null; next = null; }
        Nude(U item, Nude<U> next) { this.item = item; this.next = next; }

        boolean end() { return item == null && next == null; }
    }
    private Nude<T> top = new Nude<T>();
    
    public void push(T item) { top = new Nude<T>(item, top); }

    public T pop() {
        T s = top.item;
        if (!top.end())
            top = top.next;
        
        return s;

    }

    public static void main(String[] args) {
        LinkedStack<String> string = new LinkedStack<String>();
        for(String s : "Phasers on stun!".split(" "))
            string.push(s);
        
        String s;
        while((s = string.pop()) != null)
            System.out.print("'" + s + "' ");
    }
}