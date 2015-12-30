/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv2withundo;

/**
 *
 * @author moronkreacionz
 * @since Nov 25, 2015
 */
public class RemoteControl {

    Command[] onCommand;
    Command[] offCommand;
    Command undoCommand;
    String name; // remote control name for which house it belongs

    public RemoteControl(String name) {
        this.name = name;

        System.out.println("RemoteContorl : " + name + ", Created");

        onCommand = new Command[7];
        offCommand = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommand.length; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command argOnCommand, Command argOffCommand) {
        if (slot >= 0 || slot <= this.onCommand.length) {
            onCommand[slot] = argOnCommand;
            offCommand[slot] = argOffCommand;
        }
    }

    public void onCommandPressed(int slot) {
        if (slot >= 0 || slot <= this.onCommand.length) {
            onCommand[slot].execute();
            undoCommand = onCommand[slot];
        }
    }

    public void offCommandPressed(int slot) {
        if (slot >= 0 || slot <= this.onCommand.length) {
            offCommand[slot].execute();
            undoCommand = offCommand[slot];
        }
    }

    public void undoCommandPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nRemote Control at " + name + "\n");
        for (int i = 0; i < this.onCommand.length; i++) {
            sb.append("Slot[")
                    .append(i)
                    .append("]: \n\tOnCommand: ")
                    .append(this.onCommand[i].getClass().getName())
                    .append("and\n\tOffCommand: ")
                    .append(this.offCommand[i].getClass().getName())
                    .append(";\n");
        }
        sb.append("undoCommand: ")
                .append(this.undoCommand.getClass().getName())
                .append(";\n");

        return sb.toString();
    }
}
