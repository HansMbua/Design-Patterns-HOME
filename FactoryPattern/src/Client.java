import creator.VehicleFactory;
import product.Vehicle;

public class Client {
    Vehicle vehicle;

    public Client(VehicleFactory vehicleFactory) {
        this.vehicle = vehicleFactory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle.getInstance();
    }
}
