package ConcreteComponents;
import AbstractComponent.Beverage;

public class HouseBlend extends Beverage{
    
    public HouseBlend(){
        description = "HOuse Blend";

        
    }

    
    public double cost() {
        return 0.89;
    }

}
