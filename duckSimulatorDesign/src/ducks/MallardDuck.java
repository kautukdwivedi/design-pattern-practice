package ducks;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }
}
