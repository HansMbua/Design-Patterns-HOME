package concreteCreator;

import concreteProduct.TwoWheeler;
import creator.VehicleFactory;
import product.Vehicle;

public class TwoWheelerFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
