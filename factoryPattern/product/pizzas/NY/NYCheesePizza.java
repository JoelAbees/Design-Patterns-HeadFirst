package pizzas.NY;

import pizzas.CheesePizza;

public class NYCheesePizza extends CheesePizza{

    @Override
    public void bake() {
        System.out.print("NY");
        super.bake();
    }

    @Override
    public void box() {
        System.out.print("NY");
        super.box();
    }

    @Override
    public void cut() {
        System.out.print("NY");
        super.cut();
    }

    @Override
    public void describe() {
        System.out.print("NY");
        super.describe();
    }

    @Override
    public void prepare() {
        System.out.print("NY");
        super.prepare();
    }
    
}
