package Commands;

import InterfaceP.Command;
import Model.CeillingFan;

public class CeilingFanMediumCommand implements Command {

    private CeillingFan ceillingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }



    @Override
    public void execute() {
        prevSpeed = ceillingFan.getSpeed();
        ceillingFan.medium();

    }

    @Override
    public void undo() {

    }
}
