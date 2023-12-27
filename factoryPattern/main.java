import pizzaStores.PIzzaStore;
import pizzaStores.factory.ChicagoPizzaStore;
import pizzaStores.factory.NewYorkPizzaStore;

public interface main {
    

    public static void main(String[] args) {
        
        PIzzaStore nyStore = new NewYorkPizzaStore();
        nyStore.orderPizza("veg");


        PIzzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("clam");
    }
}
