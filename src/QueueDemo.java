import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {
    
    public static void printQ(Queue queue) {
        while(queue.peek() != null) {
            System.out.print(queue.remove() + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Random random = new Random();
        Queue<Integer> queueInt = new LinkedList<Integer>();
        
        for(int i = 0; i < 10; i++)
            queueInt.add(random.nextInt(i + 10));
        
        printQ(queueInt);
        
        Queue<Character> queueChar = new LinkedList<Character>();
        
        for(char ch : "Brontosaurus".toCharArray())
            queueChar.add(ch);
        
        printQ(queueChar);
    }
}