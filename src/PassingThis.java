class Human {
    void eat(Apple apple) {
        apple.getPeeled();
        System.out.println("Yummy");
    }
}
class Peeler {
    static Apple peel(Apple apple) { return apple; }
}

class Apple {
    Apple getPeeled() { return Peeler.peel(this); }
}
public class PassingThis {
    public static void main(String[] args) {
        new Human().eat(new Apple());
    }
}