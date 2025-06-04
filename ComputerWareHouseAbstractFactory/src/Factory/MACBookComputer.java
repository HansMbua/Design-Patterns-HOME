package Factory;

import product.Computer;

public class MACBookComputer implements ComputerFactory{
    @Override
    public Computer createComputer() {
       return new Computer();
    }

    @Override
    public void displayComputerType() {
        System.out.println("this is a MACbook computer");
    }
}
