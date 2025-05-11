package product;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void displayInfo(){
        System.out.println("Computer configurations: ");
        System.out.println("CPU: "+CPU);
        System.out.println("RAM: "+this.RAM);
        System.out.println("storage: "+storage);
    }
}
