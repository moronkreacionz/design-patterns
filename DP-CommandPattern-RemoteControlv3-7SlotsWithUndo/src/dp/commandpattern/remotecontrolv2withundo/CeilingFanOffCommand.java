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
class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }

    public void undo() {
        ceilingFan.on();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- CeilingFan Off Command -----------");
        s.append("ceiling fan name:").append(ceilingFan.getName());
        return s.toString();
    }

}
