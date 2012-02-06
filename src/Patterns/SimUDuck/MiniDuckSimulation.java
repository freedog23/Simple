package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: ASUS
 * Date: 06.02.12
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */
public class MiniDuckSimulation {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();
        
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();
        
        rubber.display();
        rubber.performFly();
        rubber.setQuackBehavior(new DuckCanSqueak());
        rubber.performQuack();
        System.out.println();
        
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        System.out.println();

        rubber.display();
        rubber.setFlyBehavior(new FlyRocketPowered());
        rubber.performFly();
        rubber.performQuack();
        System.out.println();
        

    } 
}
