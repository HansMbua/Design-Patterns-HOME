package Commands;

import InterfaceP.Command;
import Model.CeillingFan;

public class CeilingFanHighCommand implements Command {
    CeillingFan ceillingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }



    @Override
    public void execute() {
        prevSpeed = ceillingFan.getSpeed(); // save the privous speed
        ceillingFan.high();

    }

    @Override
    public void undo() {
        CeilingFanOff.undo(prevSpeed, ceillingFan);

    }
}
