package org.example.Strategy;

public class ActionsAggressive implements Actions {

    @Override
    public void move() {
        System.out.println("Mover de forma agressiva");
    }
}
