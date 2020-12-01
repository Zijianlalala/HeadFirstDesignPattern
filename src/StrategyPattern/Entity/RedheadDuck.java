package StrategyPattern.Entity;

import StrategyPattern.Entity.Base.Duck;

public class RedheadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am a redhead duck.");
        swim();
        performFly();
        performQuack();
    }
}
