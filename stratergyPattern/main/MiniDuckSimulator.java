package main;
import behaviours.fly.FlyRocketPowered;
import ducks.Duck;
import ducks.MallardDuck;
import ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[]  args){
        
        //mallard ducks
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuak();


        //model ducks
        Duck model = new ModelDuck();
        model.performFly();
        System.out.println("After a few years");
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();



    }
}
