package Commands;

import InterfaceP.Command;
import Model.Light;

public class LightOffCommand implements Command {

private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.getOff();
    }

    @Override
    public void undo() {
        light.getOn();
    }
}
