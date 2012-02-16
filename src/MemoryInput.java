import java.io.IOException;
import java.io.StringReader;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 15.02.12
 * Time: 22:07
 * To change this template use File | Settings | File Templates.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(BufferedInputFile.read("src/aaa.txt"));
        int c;
        
        while((c = in.read()) != -1)
            System.out.println((char)c + " ");
    }
}