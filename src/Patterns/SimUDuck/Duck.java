package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 04.02.12
 * Time: 2:39
 * To change this template use File | Settings | File Templates.
 */
interface FlyBehavior {
    void fly();
}
interface QuackBehavior {
    void quack();
}


public abstract class Duck {
    
    public abstract void display();
    
    public void swim() { System.out.println("All ducks float even decoys"); }
}
class DucksWings implements FlyBehavior {
    public void fly() { System.out.println("I'm flying!"); }
}
class DucksNoWings implements FlyBehavior {
    public void fly() { System.out.print("I'm can't fly."); }
}
class DucksQuack implements QuackBehavior {
    public void quack() { System.out.println("quack-quack");}
}
class DuckSqueak implements QuackBehavior {
    public void quack() { System.out.println("squeak-squeak");}
}
