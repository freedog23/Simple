package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 04.02.12
 * Time: 4:16
 * To change this template use File | Settings | File Templates.
 */
public class ModelDuck extends Duck {
    
    ModelDuck() {
        flyBehavior = new DucksNoWings();
        quackBehavior = new DucksQuack();
    }
    
    public void display() { System.out.println("I'm a model duck"); }
}
