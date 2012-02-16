import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 15.02.12
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
 */

public class BufferedInputFile {
    public static String read(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        
        StringBuilder sb = new StringBuilder();
        
        while((s = in.readLine()) != null) 
            sb.append(s + " ");
        
        in.close();
        
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("src/BufferedInputFile.java"));
    }
}