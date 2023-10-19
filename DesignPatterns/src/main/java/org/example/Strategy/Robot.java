package org.example.Strategy;

public class Robot {
    private Actions actions;

    public void setActions(Actions action) {
        actions = action;
    }

    public void move() {
        actions.move();
    }
}
