package concreteProduct;

import product.Vehicle;

public class TwoWheeler implements Vehicle {

    @Override
    public void PrintVehicle() {
        System.out.println("I am two wheeler: ");
    }

    @Override
    public Vehicle getInstance() {
        return new TwoWheeler();
    }
}
