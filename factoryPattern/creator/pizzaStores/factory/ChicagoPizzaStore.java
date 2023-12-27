package pizzaStores.factory;
import pizzaStores.PIzzaStore;
import pizzas.CheesePizza;
import pizzas.Pizza;
import pizzas.Chicago.ChicagoCLamPizza;
import pizzas.Chicago.ChicagoCheesePizza;
import pizzas.Chicago.ChicagoPepperoniPizza;
import pizzas.Chicago.ChicagoVeggiePizza;

public class ChicagoPizzaStore extends PIzzaStore{

    //FActoryMethod
    public Pizza createPizza(String type) {
        
        Pizza pizza;
        switch (type) {
            case "veg":
                pizza = new ChicagoVeggiePizza();
                break;
            case "clam":
                pizza = new ChicagoCLamPizza();
                break;
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "pep":
                pizza = new ChicagoPepperoniPizza();
                break;
            default:
                pizza = new CheesePizza();
                break;
        }


        return pizza;
    }

    
}