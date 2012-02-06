package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 06.02.12
 * Time: 21:35
 * To change this template use File | Settings | File Templates.
 */
public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new DuckCanFly();
        quackBehavior = new DuckCanQuack();
    }
    
    public void display() { System.out.println("I'm real a mallard duck!"); }
}
