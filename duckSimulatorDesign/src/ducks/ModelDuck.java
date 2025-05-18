package ducks;

import behaviors.fly.FlyNoWay;
import behaviors.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        super( new FlyNoWay(), new Quack());
    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
