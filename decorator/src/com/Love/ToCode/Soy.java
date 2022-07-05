package com.Love.ToCode;

public class Soy extends CondimentDecorator{
   Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public Size getSize() {
        return beverage.getSize();
    }


    @Override
    public double cost() {

        double cost = beverage.cost();
        if (getSize() == Size.LARGE) {
            cost += 10;
        } else if (getSize() == Size.MEDIUM) {
            cost += .15;
        } else if (getSize() == Size.SMALL) {
            cost += 20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +",Soy";
    }
}
