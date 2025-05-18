import behaviors.fly.FlyRocketPowered;
import ducks.Duck;
import ducks.MallardDuck;
import ducks.ModelDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
} 