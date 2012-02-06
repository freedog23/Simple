package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 06.02.12
 * Time: 21:11
 * To change this template use File | Settings | File Templates.
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    abstract void display();
    
    void performFly() { flyBehavior.fly(); }
    void performQuack() { quackBehavior.quack(); }
    
    void setFlyBehavior(FlyBehavior flyBehavior) { this.flyBehavior = flyBehavior; }
    void setQuackBehavior(QuackBehavior quackBehavior) { this.quackBehavior = quackBehavior; }
    
    void swim() { System.out.println("All ducks float even decoys!");}
}
