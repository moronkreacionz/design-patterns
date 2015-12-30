/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv2withundo;

/**
 *
 * @author moronkreacionz
 * @since Nov 24, 2015
 */
public class GarageDoorCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.close();
    }

    public void undo() {
        garageDoor.open();
    }
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- GarageDoor Command -----------");
        s.append("garage door name:").append(garageDoor.getName());
        return s.toString();
    }

}
