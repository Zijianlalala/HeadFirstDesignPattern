package StrategyPattern.Behavior.impl;

import StrategyPattern.Behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly with wings~");
    }
}
