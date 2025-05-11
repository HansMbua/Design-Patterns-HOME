import concreteCreator.FourWheelerFactory;
import concreteCreator.TwoWheelerFactory;
import concreteProduct.FourWheeler;
import creator.VehicleFactory;
import product.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client client = new Client(twoWheelerFactory);
        Vehicle twoWheeler = client.getVehicle();
        twoWheeler.PrintVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Client fourWheelerClient = new Client(fourWheelerFactory);
        Vehicle vehicle = fourWheelerClient.getVehicle();
        vehicle.PrintVehicle();


    }
}