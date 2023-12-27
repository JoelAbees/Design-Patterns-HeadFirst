package pizzaStores.factory;
import pizzaStores.PIzzaStore;
import pizzas.CheesePizza;
import pizzas.Pizza;
import pizzas.NY.NYCheesePizza;
import pizzas.NY.NYClamPizza;
import pizzas.NY.NYVeggiePizza;


public class NewYorkPizzaStore extends PIzzaStore{

    //FActoryMethod
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type) {
            case "veg":
                pizza = new NYVeggiePizza();
                break;
            case "clam":
                pizza = new NYClamPizza();
                break;
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "pep":
                pizza = new NYCheesePizza();
                break;
            default:
                pizza = new CheesePizza();
                break;
        }


        return pizza;
    }
    
    
} 
