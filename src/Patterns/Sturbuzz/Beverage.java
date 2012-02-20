package Patterns.Sturbuzz;

/**
 * Created by IntelliJ IDEA.
 * User: SONYVAIO
 * Date: 16.02.12
 * Time: 19:35
 * To change this template use File | Settings | File Templates.
 */
public abstract class Beverage {
    protected String description = "unknown Beverage";
    protected char size;
    
    public String getDescription() { return description; }
    public abstract Double cost();

    protected void setSize(char size) { this.size = Character.toUpperCase(size); }
    protected Double getSize() {
        if(size == 'S') return .10;
        if(size == 'M') return .15;
        if(size == 'L') return .20;
        return 0.0;
    }
}

