package ConcreteDecorators;

import AbstractComponent.Beverage;
import AbstractDecorator.CondimentDecorator;

public class Whip  extends CondimentDecorator{


    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    
    public double cost() {
        
        return beverage.cost() + 0.10;
    }
    
}
