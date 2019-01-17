package ru.nik66.ducks.ducks;

import ru.nik66.ducks.Duck;
import ru.nik66.ducks.behavior.FlyWithWings;
import ru.nik66.ducks.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.setFlyBehavior(new FlyWithWings());
        this.setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
