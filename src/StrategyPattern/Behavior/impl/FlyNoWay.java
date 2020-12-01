package StrategyPattern.Behavior.impl;

import StrategyPattern.Behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I cannot fly!");
    }
}
