package Patterns.SimUDuck;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 04.02.12
 * Time: 4:10
 * To change this template use File | Settings | File Templates.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println();



        Duck modelDuck = new ModelDuck();

        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println();

        /* change Behavior dynamic*/

        modelDuck.display();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println();

        /* Behavior quack only*/

        QuackBehavior decoyDuck = new DecoyDuck();
        decoyDuck.quack();
        System.out.println();
    }
}
