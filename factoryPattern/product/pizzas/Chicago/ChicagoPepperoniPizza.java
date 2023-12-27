package pizzas.Chicago;

import pizzas.PepperoniPizza;

public class ChicagoPepperoniPizza  extends PepperoniPizza{

    @Override
    public void bake() {
        System.out.print("Chicago");
        super.bake();
    }

    @Override
    public void box() {
        System.out.print("Chicago");
        super.box();
    }

    @Override
    public void cut() {
        System.out.print("Chicago");
        super.cut();
    }

    @Override
    public void describe() {
        System.out.print("Chicago");
        super.describe();
    }

    @Override
    public void prepare() {
        System.out.print("Chicago");
        super.prepare();
    }
    
}