package Commands;

import InterfaceP.Command;
import Model.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }



    @Override
    public void execute() {
        garageDoor.getLightOn();
    }

    @Override
    public void undo() {
        garageDoor.getDown();
    }
}
