class Grain {
    String process() { return getClass().getSimpleName(); }
}
class Wheat extends Grain {}

class Mill {
    Grain process() { return new Grain(); }
}
class WheatMill extends Mill {
    Wheat process() { return new Wheat(); }
}
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g.process());
        
        m = new WheatMill();
        g = m.process();
        System.out.println(g.process());
    }
}