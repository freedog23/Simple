import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 07.02.12
 * Time: 1:40
 * To change this template use File | Settings | File Templates.
 */

public class InputFile {
    private BufferedReader in;
    
    InputFile(String filename) throws Exception {
    
        try {
                in = new BufferedReader(new FileReader(filename));
        
        } catch(FileNotFoundException e) {
                System.out.println("File not found");
                throw e;
        
        } catch(Exception e) {
                try {   
                        in.close();
                                
                } catch(IOException e2) {
                        System.out.println("Internal error, can't close file");
                }
                throw e;
        }
    }
    public String getLine() {
        String s;

        try {
                s = in.readLine();
            
        } catch(IOException e) {
                throw new RuntimeException("Cannot read line");    
            
        }
        return s;
    }
    
    public void dispose() {
        try {
                in.close();
                System.out.println("Reading file was complete");
        
        } catch(IOException e2) {
                throw new RuntimeException("Cannot close line");
            
        }
    }
}