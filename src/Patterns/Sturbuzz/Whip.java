package Patterns.Sturbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 16.02.12
 * Time: 21:04
 * To change this template use File | Settings | File Templates.
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;
    
    Whip(Beverage beverage) {
        this.beverage = beverage;
        setSize('s');

    }

    @Override
    public String getDescription() {
        return beverage.getDescription()
                + ", Whip " + this.size;
    }

    @Override
    public Double cost() {
        return beverage.cost() + this.getSize();
    }
}
