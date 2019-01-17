package ru.nik66.ducks.behavior;

import ru.nik66.ducks.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }

}
