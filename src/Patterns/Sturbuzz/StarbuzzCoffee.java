package Patterns.Sturbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 16.02.12
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage coffeeEspresso = new Espresso();
        System.out.println(coffeeEspresso.getDescription()
                + " " + coffeeEspresso.cost() +"$");
        
        Beverage coffeeDarkRoast = new DarkRoast();
        coffeeDarkRoast = new Mocha(coffeeDarkRoast);
        coffeeDarkRoast = new Whip(coffeeDarkRoast);
        System.out.println(coffeeDarkRoast.getDescription()
                + " " + coffeeDarkRoast.cost() + "$");

        Beverage coffeeHouseBlend =  new HouseBlend();
        coffeeHouseBlend = new Soy(coffeeHouseBlend);
        coffeeHouseBlend = new Mocha(coffeeHouseBlend);
        coffeeHouseBlend = new Whip(coffeeHouseBlend);
        coffeeHouseBlend = new Cup(coffeeHouseBlend);
        System.out.println(coffeeHouseBlend.getDescription()
                + " " + coffeeHouseBlend.cost() + "$");

    }
}
