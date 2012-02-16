import java.awt.datatransfer.StringSelection;
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
                throw new RuntimeException("Can't read current line");
        }
        return s;
    }

    public void dispose() {
        try {
                in.close();
                System.out.println("Reading success");
        } catch(IOException e) {
            throw new RuntimeException("Internal error. Cant close file.");
        }
    }

}

/*
public class InputFile {
    private BufferedReader in;
    
    InputFile(String filename) throws Exception {
        try {
                in = new BufferedReader(new FileReader(filename));
                
        } catch(FileNotFoundException e) {
                System.out.println("File not found.");
                throw e;

        } catch(Exception e) {
                try {
                        in.close();

                } catch(IOException e2) {
                        System.out.println("Internal error. Cannot close file.");

                }
                throw e;
        }       
    }

    public String getLine() {
        String s;
        try {
                s = in.readLine();

        } catch(IOException e) {
                throw new RuntimeException("Can't read current line");

        }
        return s;
    }
    
    public void dispose() {
        try {
                in.close();
                System.out.println("Reading file was complete");
            
        } catch(IOException e2) {
                throw new RuntimeException("Internal error. Cant close file.");

        }
    }
}
*/
