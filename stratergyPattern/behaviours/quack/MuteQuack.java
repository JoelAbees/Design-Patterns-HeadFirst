package behaviours.quack;

import interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour{
    public void quack(){
        System.out.println("<<SIlence>>");
    }
}
