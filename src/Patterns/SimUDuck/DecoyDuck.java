package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 06.02.12
 * Time: 21:54
 * To change this template use File | Settings | File Templates.
 */
public class DecoyDuck extends Duck {

    DecoyDuck() {
        flyBehavior = new DuckCantFly();
        quackBehavior = new DuckCanQuack();
    }
    
    public void display() { System.out.println("Decoy");}
}
