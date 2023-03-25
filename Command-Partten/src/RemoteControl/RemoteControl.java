package RemoteControl;

import InterfaceP.Command;
import InterfaceP.NoCommand;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

        }
        undoCommand = noCommand;

    }

    //setting the commands on the remote slots
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    /** when a button is pressed, we take the command and first execute
     * it then we save a reference to it in the undoCommand instance variable.
     * do this for both "on" commands and "off" commands
     * @param slot
     */
    public void onButtonWasPush(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPush(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    /**
     * when the undo button is pressed, we invoke the undo() method of the command stored in undoCommand this reverses the operation of the
     * last command executed.
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n---- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuilder.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"   "+offCommands[i].getClass() + "\n");

        }

        return stringBuilder.toString();
    }



}
