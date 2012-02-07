import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 07.02.12
 * Time: 2:32
 * To change this template use File | Settings | File Templates.
 */
public class ArrayWorkFile {
    private ArrayList<String> string;
    
    ArrayWorkFile() {
        string = new ArrayList<String>();

        try {
            InputFile fileIn = new InputFile("src/aaa.txt");

            try {
                String s;
                while((s = fileIn.getLine()) != null) {
                    for(String c : s.split(" "))
                        string.add(c);
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            finally {
                fileIn.dispose();
            }
        }
        catch(Exception e) {
            System.out.println("Error.");
        }

    }
    
    public void printArray() { 
        for(String s : string) 
            System.out.println("'" + s + "' ");
    }

    public static void main(String[] args) {
        ArrayWorkFile a = new ArrayWorkFile();
        a.printArray();
    }
}
