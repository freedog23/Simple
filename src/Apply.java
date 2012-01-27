interface Processor {
    String getProcessName();
    Object process(Object object);
}
public class Apply {
    private Apply() {}
    static void process(Processor p, Object s) {
        System.out.println("Используется процесс: " + p.getProcessName());
        System.out.println(p.process(s));
        
    }
}



/*
interface Processor {

    String getProcessorName();
    Object process(Object inputStringValue);
}

public class Apply {
    public static void process(Processor p, String s) {
        System.out.println("Используется процесс: " + p.getProcessorName());
        System.out.println(p.process(s));

    }
}
*/