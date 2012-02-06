package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 06.02.12
 * Time: 21:40
 * To change this template use File | Settings | File Templates.
 */
public class RubberDuck extends Duck {
    
    RubberDuck() {
        flyBehavior = new DuckCantFly();
        quackBehavior = new DuckCantQuack();
    }

    public void display() { System.out.println("The real rubber duck"); }
}
