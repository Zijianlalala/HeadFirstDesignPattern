package StrategyPattern.Behavior.impl;

import StrategyPattern.Behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking..");
    }
}
