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
        private Nude <U> next;
        
        Nude() { this.item = null; this.next = null; }
        Nude(U item, Nude<U> next) { this.item = item; this.next = next; }

        public boolean end() { return item == null && next == null; }
    }
    
    private Nude<T> nude = new Nude<T>();
    
    public void push(T item) { nude = new Nude<T>(item, nude); }
    
    public T pop() {
        T s = nude.item;
        if(!nude.end())
            nude = nude.next;
        return s;
    }

    public static void main(String[] args) {
        LinkedStack<String> example = new LinkedStack<String>();
        for(String s : "Phasers on stun!".split(" "))
            example.push(s);

        String s;
        while((s = example.pop()) != null) {
            System.out.print(" " + s + " ");
        }
    }
    
}