package Commands;

import InterfaceP.Command;
import Model.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.getDown();
    }

    @Override
    public void undo() {
        garageDoor.getLightOn();
    }
}
