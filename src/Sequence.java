interface Selector {
    boolean end();
    Object current();
    void next();
}
public class Sequence {
    private Object[] items;
    private int next = 0;
    
    Sequence(int sizeOfArray) { items = new Object[sizeOfArray]; }
    
    void add(Object x) { if (next < items.length) items[next++] = x; }
    
    Selector selector() {
        return new Selector() {
            private int count = 0;

            @Override
            public boolean end() { return count == items.length; }

            @Override
            public Object current() { return items[count]; }

            @Override
            public void next() { if (count < items.length) count++; }
        };
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i + 1));
        
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}