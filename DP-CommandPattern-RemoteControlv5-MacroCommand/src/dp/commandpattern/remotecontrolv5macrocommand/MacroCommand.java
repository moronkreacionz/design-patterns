/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv5macrocommand;

/**
 *
 * @author moronkreacionz
 * @since Nov 25, 2015
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] argCommands) {
        this.commands = argCommands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].undo();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.commands.length; i++) {
            sb.append("CommandList[")
                    .append(i)
                    .append("]: \n\tCommand: ")
                    .append(this.commands[i].getClass().getName())
                    .append(";\n");
        }
        return sb.toString();
    }

}
