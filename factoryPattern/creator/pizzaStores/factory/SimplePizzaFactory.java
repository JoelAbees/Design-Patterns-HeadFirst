import pizzas.CheesePizza;
import pizzas.ClamPizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;
import pizzas.VeggiePizza;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza;
        switch (type) {
            case "veg":
                pizza = new VeggiePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pep":
                pizza = new PepperoniPizza();
                break;
            default:
                pizza = new CheesePizza();
                break;
        }


        return pizza;
    }
}
