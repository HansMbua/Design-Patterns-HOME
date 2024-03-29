package Commands;

import InterfaceP.Command;
import Model.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.getOn();
    }

    @Override
    public void undo() {
        light.getOff();
    }
}
