package Factory;

import product.Computer;

public interface ComputerFactory {
    Computer createComputer();
    void displayComputerType();
}
