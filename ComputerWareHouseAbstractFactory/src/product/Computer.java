package product;

import Factory.ComputerFactory;

public class Computer implements AbstractComputer {
    private String Screen;
    private String Keyboard;

    public String getScreen() {
        return Screen;
    }

    public void setScreen(String screen) {
        Screen = screen;
    }

    public String getKeyboard() {
        return Keyboard;
    }

    public void setKeyboard(String keyboard) {
        Keyboard = keyboard;
    }


    @Override
    public void searchTheWeb() {
        System.out.println("can search the web");
    }
}
