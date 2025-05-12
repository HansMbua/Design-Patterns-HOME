package ConcrateProduce;

import abstractProduct.CarSpecification;

public class NorthAmericaSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America car specification: Safety features compliant with local regulations");
    }
}
