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