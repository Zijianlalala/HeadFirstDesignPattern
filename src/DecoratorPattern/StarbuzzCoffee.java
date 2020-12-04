package DecoratorPattern;

import DecoratorPattern.ConcreteBeverage.Espresso;
import DecoratorPattern.ConcreteBeverage.HouseBlend;
import DecoratorPattern.ConcreteDecorator.Mocha;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+
                " $ " + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+
                " $ " + beverage2.cost());
    }
}
