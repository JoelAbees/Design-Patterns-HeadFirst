package ConcreteComponents;
import AbstractComponent.Beverage;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Dark Roast";
    }

    public double cost(){
        return 0.99;
    }
}
