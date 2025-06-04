import Factory.ComputerFactory;
import Factory.MACBookComputer;
import product.AbstractComputer;

public class Main {
    public static void main(String[] args) {
        ComputerFactory macBookComputer = new MACBookComputer();
        AbstractComputer macBook = macBookComputer.createComputer();
        macBook.searchTheWeb(); // has it way of searching the web
        macBookComputer.displayComputerType();
    }
}