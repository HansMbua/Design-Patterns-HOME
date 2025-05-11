package concreteCreator;

import concreteProduct.FourWheeler;
import creator.VehicleFactory;
import product.Vehicle;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
