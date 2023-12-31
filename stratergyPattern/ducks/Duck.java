package ducks;
import interfaces.FlyBehaviour;
import interfaces.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){

    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuak(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("All ducks swim");
    }


    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
    
}