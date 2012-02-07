import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 07.02.12
 * Time: 1:40
 * To change this template use File | Settings | File Templates.
 */
public class InputFile {
    private BufferedReader incoming;

    InputFile(String nameFile) throws Exception {
        try {
            incoming = new BufferedReader(new FileReader(nameFile));
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found, please correct name of file");
            throw e;
        }
        catch(Exception e) {
            try {
                incoming.close();
            }
            catch(IOException e2) {
                System.out.println("Error, cannot close file.");
            }
            throw e;
        }
    }

    public String getLine() {
        String s;

        try {
            s = incoming.readLine();
        }
        catch(IOException e) {
            throw new RuntimeException("Cannot read line in current file");
        }
        return s;
    }

    public void dispose() {
        try {
            incoming.close();
            System.out.println("File read success");
        }
        catch(IOException e2) {
            throw new RuntimeException("Error, cannot close file.");
        }
    }
}