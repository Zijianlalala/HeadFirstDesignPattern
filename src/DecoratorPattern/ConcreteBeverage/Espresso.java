package DecoratorPattern.ConcreteBeverage;

import DecoratorPattern.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
