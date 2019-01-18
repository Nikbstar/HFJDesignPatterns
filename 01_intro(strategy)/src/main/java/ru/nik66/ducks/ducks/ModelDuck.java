package ru.nik66.ducks.ducks;

import ru.nik66.ducks.Duck;
import ru.nik66.ducks.behavior.FlyNoWay;
import ru.nik66.ducks.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }

}
