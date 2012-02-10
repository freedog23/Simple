import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 07.02.12
 * Time: 2:32
 * To change this template use File | Settings | File Templates.
 */


public class ArrayWorkFile {
    private ArrayList<String> string;
    
    ArrayWorkFile(String filename) {
        try {
                InputFile in = new InputFile(filename);
                string = new ArrayList<String>();
            
            try {
                    String s;
                    while((s = in.getLine()) != null)
                        Collections.addAll(string, s.split(" "));
            
            } catch(Exception e) {
                    e.printStackTrace();
            
            } finally {
                    in.dispose();
            }


        } catch(Exception e) {
                System.out.println("Error");
        }
    }
    
    public void printArray() { System.out.println(string); }

    public static void main(String[] args) {
        ArrayWorkFile f = new ArrayWorkFile("src/aaa.txt");
        f.printArray();
    }
}