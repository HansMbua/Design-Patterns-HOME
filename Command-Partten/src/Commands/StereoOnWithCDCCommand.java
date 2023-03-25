package Commands;

import InterfaceP.Command;
import Model.Stereo;

public class StereoOnWithCDCCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.setOn("on");
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.setOff("off");
        stereo.setCd();
        stereo.setVolume(0);
    }
}
