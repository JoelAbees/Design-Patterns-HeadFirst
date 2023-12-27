package pizzaStores;

import pizzas.Pizza;

public abstract class PIzzaStore {
    

    
    

    public Pizza orderPizza(String type){
        
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.describe();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
