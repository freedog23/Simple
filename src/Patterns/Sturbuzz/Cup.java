package Patterns.Sturbuzz;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 16.02.12
 * Time: 23:02
 * To change this template use File | Settings | File Templates.
 */
public class Cup extends CondimentDecorator {
    private Beverage beverage;

    Cup(Beverage beverage) {
        this.beverage = beverage;
        setSize('s');
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription()
            + ", Cup: " + this.size;
    }

    @Override
    public Double cost() {
        return beverage.cost() + this.getSize();
    }
}
