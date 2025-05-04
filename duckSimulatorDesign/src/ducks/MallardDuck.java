package ducks;

import behaviors.FlyWithWings;
import behaviors.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }
}
