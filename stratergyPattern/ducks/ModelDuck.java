package ducks;
import behaviours.fly.FlyNoWay;
import behaviours.quack.Quack;

public class ModelDuck extends Duck{
    
    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    public void display(){
        System.out.println("I'm a modle duck");
    }

}
