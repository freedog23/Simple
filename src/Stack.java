import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    
    public boolean empty() { return storage.isEmpty(); }
    
    public void push(T t) { storage.addFirst(t); }
    
    public T peek() { return storage.getFirst(); }
    
    public T pop() { return storage.removeFirst(); }
    
    public String toString() { return storage.toString(); }
}