package Patterns.Sturbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 16.02.12
 * Time: 20:07
 * To change this template use File | Settings | File Templates.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setSize('s');
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()
                + ", Mocha " + this.size;
    }

    @Override
    public Double cost() {
        return beverage.cost() + this.getSize();
    }
}
