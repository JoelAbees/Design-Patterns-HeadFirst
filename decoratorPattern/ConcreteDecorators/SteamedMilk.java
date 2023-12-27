package ConcreteDecorators;

import AbstractComponent.Beverage;
import AbstractDecorator.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator{


    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", SteamedMilk";
    }

    
    public double cost() {
        
        return beverage.cost() + 0.10;
    }
    
}
