package ru.nik66.ducks.behavior;

import ru.nik66.ducks.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
