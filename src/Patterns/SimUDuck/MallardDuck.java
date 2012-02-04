package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 04.02.12
 * Time: 4:00
 * To change this template use File | Settings | File Templates.
 */
public class MallardDuck extends Duck {

    MallardDuck() {
        flyBehavior = new DucksWings();    // composition OOP
        quackBehavior = new DucksQuack();  // HAS-A
    }

    public void display() { System.out.println("I'm real mallard duck!"); }
}
