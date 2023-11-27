package ducks;
import behaviours.fly.FlyWIthWings;
import behaviours.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehaviour =  new FlyWIthWings();
        quackBehaviour = new Quack();
    }

    public void display(){
        System.out.println("I'm a Mallard Duck");
    }
}
