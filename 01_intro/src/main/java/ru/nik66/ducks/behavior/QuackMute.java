package ru.nik66.ducks.behavior;

import ru.nik66.ducks.interfaces.QuackBehavior;

public class QuackMute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
