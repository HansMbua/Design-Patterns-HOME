package concreteProduct;

import product.Vehicle;

public class FourWheeler implements Vehicle {
    @Override
    public void PrintVehicle() {
        System.out.println("I am a four wheeler");
    }

    @Override
    public Vehicle getInstance() {
        //singleton
        return new FourWheeler();
    }
}
