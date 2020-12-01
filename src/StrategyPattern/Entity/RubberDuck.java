package StrategyPattern.Entity;

import StrategyPattern.Entity.Base.Duck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a rubber duck.");
        swim();
        performFly();
        performQuack();
    }
}
