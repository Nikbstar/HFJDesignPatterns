package ru.nik66.ducks;

import org.junit.Test;
import ru.nik66.ducks.behavior.FlyRocketPowered;
import ru.nik66.ducks.ducks.MallardDuck;
import ru.nik66.ducks.ducks.ModelDuck;

public class DuckTest {

    @Test
    public void mallardDuckTest() {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
    }

    @Test
    public void modelDuckWithRocketPowerTest() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}