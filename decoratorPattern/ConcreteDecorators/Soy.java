package ConcreteDecorators;

import AbstractComponent.Beverage;
import AbstractDecorator.CondimentDecorator;

public class Soy extends CondimentDecorator{


    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    
    public double cost() {
        
        return beverage.cost() + 0.15;
    }
    
}
