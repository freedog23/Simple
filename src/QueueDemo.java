import java.util.*;

public class QueueDemo {
    public static void printQ(Queue queue) {
        while(queue.peek() != null) 
            System.out.print("'" + queue.remove() + "' ");
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Integer> queueInt = new LinkedList<Integer>();
        for(int i = 0; i < 10; i++) 
            queueInt.offer(random.nextInt(10 + i));

        printQ(queueInt);

        Queue<Character> queueChar = new LinkedList<Character>();
        for(char c : "Brontosaurus".toCharArray())
            queueChar.offer(c);

        printQ(queueChar);
    }
}