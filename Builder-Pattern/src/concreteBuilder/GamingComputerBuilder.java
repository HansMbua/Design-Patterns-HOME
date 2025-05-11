package concreteBuilder;

import builder.Builder;
import product.Computer;

public class GamingComputerBuilder implements Builder {
    private Computer computer;

    public GamingComputerBuilder(){
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        this.computer.setCPU("Gaming CPU");

    }

    @Override
    public void buildRAM() {
       computer.setRAM("16GB DDR4");
    }

    @Override
    public void buildStorage() {
      computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}
