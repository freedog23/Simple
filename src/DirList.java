import java.io.File;
import java.io.FilenameFilter;
import java.io.FilterInputStream;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 17.02.12
 * Time: 19:22
 * To change this template use File | Settings | File Templates.
 */

public class DirList {

    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;
        
        if(args.length == 0)
            list = path.list();
        else {
            list = path.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return Pattern.compile(args[0]).matcher(name).matches();
                }
            });
        }
        
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

        for(String s : list)
            System.out.println(s);
    }
}