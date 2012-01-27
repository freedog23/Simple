import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo {

    public static void printQ(Queue queue) {
        while(queue.peek() != null)
            System.out.print(" '" + queue.remove() + "' ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Queue<Integer> queueInt = new LinkedList<Integer>();
        
        for(int i = 0; i < 10; i++)
            queueInt.offer(random.nextInt(i + 10));

        printQ(queueInt);
    
        Queue<Character> queueChar = new LinkedList<Character>();
        
        for(char s : "Brontosaurus".toCharArray()) 
            queueChar.add(s);
        
        printQ(queueChar);
    }
}