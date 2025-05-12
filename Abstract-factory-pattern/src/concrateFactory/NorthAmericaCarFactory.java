package concrateFactory;

import AbstractFactory.CarFactory;
import ConcrateProduce.Hatchback;
import ConcrateProduce.NorthAmericaSpecification;
import abstractProduct.Car;
import abstractProduct.CarSpecification;

public class NorthAmericaCarFactory implements CarFactory {


    @Override
    public Car createCar() {
        return new Hatchback(); // name of car
    }

    @Override
    public CarSpecification creatCarSpecification() {
        return new NorthAmericaSpecification(); // specification of car
    }
}
