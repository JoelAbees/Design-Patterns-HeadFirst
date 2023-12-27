package AbstractComponent;
public abstract class Beverage {

    protected String description = "Unknown Description";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}