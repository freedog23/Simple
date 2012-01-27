class Engine {
    public void start() {}
    public void stop() {}
}
class Window {
    public void rollup() {}
    public void rolldown() {}
}
class Door {
    Window window = new Window();
    public void open() {}
    public void close() {}
}
class Wheel {
    public void inflate(int psi) {}
}
public class Car {
    private Engine engine = new Engine();
    private Door doorRight = new Door(), doorLeft = new Door();
    private Wheel[] wheel = new Wheel[4];
    
    Car() {
        for(int i = 0; i < wheel.length; i++)
            wheel[i] = new Wheel();
    }
    
    public static void main(String[] args) {
        Car car = new Car();
        car.wheel[0].inflate(185);
        car.doorLeft.open();
        car.engine.start();
        car.doorLeft.close();
        car.doorLeft.window.rolldown();
    }
}
