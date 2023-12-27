package ConcreteDecorators;

import AbstractComponent.Beverage;
import AbstractDecorator.CondimentDecorator;

public class Mocha extends CondimentDecorator{


    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    
    public double cost() {
        
        return beverage.cost() + 0.20;
    }
    
}
