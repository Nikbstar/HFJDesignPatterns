package ru.nik66.ducks.behavior;

import ru.nik66.ducks.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
