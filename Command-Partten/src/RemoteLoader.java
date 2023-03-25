import Commands.*;
import Model.CeillingFan;
import Model.GarageDoor;
import Model.Light;
import Model.Stereo;
import RemoteControl.RemoteControl;

public class RemoteLoader {

    public static void main(String[] args){

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        CeillingFan ceillingFan = new CeillingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightRoomCommandOff = new LightOffCommand(livingRoomLight);
        LightOnCommand KitchenLighton = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        //CeilingFanOnCommand
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceillingFan);
        CeilingFanOff ceilingFanOff = new CeilingFanOff(ceillingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        // StereoOnwithCDCommand here

        //setting the command to the remote
        remoteControl.setCommand(0,ceilingFanHighCommand, ceilingFanOff);
        remoteControl.onButtonWasPush(0);

        remoteControl.offButtonWasPush(0);
        remoteControl.undoButtonWasPushed();

//        remoteControl.setCommand(1,livingRoomLightOn,lightRoomCommandOff);
//        remoteControl.setCommand(2,KitchenLighton,kitchenLightOff);
//        System.out.println(remoteControl);
//
//        remoteControl.onButtonWasPush(1);
//        remoteControl.offButtonWasPush(1);
//        remoteControl.offButtonWasPush(2);
//        remoteControl.onButtonWasPush(2);
//        remoteControl.undoButtonWasPushed();













    }
}
