import java.util.Arrays;

public abstract class StringProcess implements Processor {
    public static String s = "Hellow my word, this is my first program";

    public abstract Object process(Object object);
    public String getProcessName() { return getClass().getSimpleName(); }

    public static void main(String[] args) {
        Apply.process(new UpperCase(), s);
        Apply.process(new LowerCase(), s);
        Apply.process(new Splitter(), s);
    }
}
class UpperCase extends StringProcess {
    public String process(Object object) { return ((String)object).toUpperCase(); }
}
class LowerCase extends StringProcess {
    public String process(Object object) { return ((String)object).toLowerCase(); }
}
class Splitter extends StringProcess {
    public String process(Object object) { return Arrays.toString(((String)object).split(" ")); }
}