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

            throw new RuntimeException("Internal error, can't read line");
        }
        return s;
    }
    
    public void dispose() {
        try {
            in.close();

        } catch(IOException e) {
            throw new RuntimeException("Internal error, can't read line");

        }
    }
}

class OutputFile {
    private BufferedWriter out;

    OutputFile(String filename) throws Exception {
        try {
            out = new BufferedWriter(new FileWriter(filename));

        } catch(IOException e) {
            System.out.println("Cannot open file");

        } catch(Exception e) {
            try {
                out.close();

            } catch(IOException e2) {
                System.out.println("Internal error, can't close file");
                
            }
            throw e;
        }
    }
    public void recordLine(String line) {
        try {
            out.write(line);
            out.newLine();
            out.flush();
        } catch(IOException e) {
            throw new RuntimeException("Internal error, cannot write line");
        }
    }

    public void dispose() {
        try {
            out.close();

        } catch(IOException e) {
            throw new RuntimeException("Internal error, cannot write line");
        }
    }
}

