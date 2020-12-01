package StrategyPattern;

import StrategyPattern.Behavior.impl.FlyNoWay;
import StrategyPattern.Behavior.impl.FlyWithWings;
import StrategyPattern.Behavior.impl.Quack;
import StrategyPattern.Behavior.impl.Squeak;
import StrategyPattern.Entity.Base.Duck;
import StrategyPattern.Entity.RedheadDuck;
import StrategyPattern.Entity.RubberDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Squeak());
        duck.display();
    }
}
