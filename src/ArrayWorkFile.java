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

    ArrayWorkFile(String filenameInput, String filenameOutput) {
        
        try {
            InputFile in = new InputFile(filenameInput);
            OutputFile out = new OutputFile(filenameOutput);

            string = new ArrayList<String>();

            try {
                String s;
                while((s = in.getLine()) != null)
                    string.add(s);

                for(String ss : string)
                    out.recordLine(ss);
                
            } catch(Exception e) {
                    e.printStackTrace();        
                
            } finally {
                in.dispose();
                out.dispose();
                
            }
        
        } catch(Exception e) {
            System.out.println("Error");
        
        }
    }
    
    public void printArray() { System.out.println(string); }

    public static void main(String[] args) {
        ArrayWorkFile readFile = new ArrayWorkFile("src/aaa.txt", "src/bbb.txt");
        readFile.printArray();
    }
}