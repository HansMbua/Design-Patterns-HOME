package AbstractFactory;

import abstractProduct.Car;
import abstractProduct.CarSpecification;

public interface CarFactory {
    Car createCar();
    CarSpecification creatCarSpecification();
}
