package Commands;

import InterfaceP.Command;
import Model.CeillingFan;

public class CeilingFanOff implements Command {

    CeillingFan  ceillingFan ;
    private int prevSpeed;

    public CeilingFanOff(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }




    @Override
    public void execute() {
        prevSpeed = ceillingFan.getSpeed();
        ceillingFan.off();
    }

    @Override
    public void undo() {
        undo(prevSpeed, ceillingFan);

    }

    static void undo(int prevSpeed, CeillingFan ceillingFan) {
        if(prevSpeed == ceillingFan.HIGH){
            ceillingFan.high();
        } else if ( prevSpeed == ceillingFan.MEDIUM){
            ceillingFan.medium();
        }
        else if (prevSpeed == ceillingFan.LOW){
            ceillingFan.low();
        }else if (prevSpeed == ceillingFan.OFF){
            ceillingFan.off();
        }
    }
}
