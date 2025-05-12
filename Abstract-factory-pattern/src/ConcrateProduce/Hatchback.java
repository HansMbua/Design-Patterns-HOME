package ConcrateProduce;

import abstractProduct.Car;

public class Hatchback implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Hatchback car");
    }
}
