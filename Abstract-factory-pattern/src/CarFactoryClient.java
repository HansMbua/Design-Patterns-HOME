import AbstractFactory.CarFactory;
import abstractProduct.Car;
import abstractProduct.CarSpecification;
import concrateFactory.NorthAmericaCarFactory;

public class CarFactoryClient {
    public static void main(String[] args) {
    // creating car for North America

        CarFactory northAmericaFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec = northAmericaFactory.creatCarSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // creating cars from Europe
    }
}