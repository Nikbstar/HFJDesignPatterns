package ru.nik66.ducks;

import ru.nik66.ducks.interfaces.FlyBehavior;
import ru.nik66.ducks.interfaces.QuackBehavior;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
