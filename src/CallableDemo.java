import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 19.02.12
 * Time: 2:52
 * To change this template use File | Settings | File Templates.
 */

class TaskWithResult implements Callable<String> {
    private int id;
    
    TaskWithResult(int id) { this.id = id; }
    
    public String call() { return "Result of class TaskWithResult " + id; }
}

public class CallableDemo {
    public static void main(String[] args) {
        ArrayList<Future<String>> result = new ArrayList<Future<String>>();
        ExecutorService exec = Executors.newCachedThreadPool();
        
        for(int i = 0; i < 10; i++)
            result.add(exec.submit(new TaskWithResult(i)));
        
        for(Future<String> s : result) {
            try {
                System.out.println(s.get());
                
            } catch(InterruptedException e) {
                System.out.println(e);
                return;
            
            } catch(ExecutionException e) {
                System.out.println(e);
                
            } finally {
                exec.shutdown();

            }

        }
        
    }
}