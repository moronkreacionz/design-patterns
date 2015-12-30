/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.commandpattern.remotecontrolv2withceilingfanspeeds;

/**
 *
 * @author moronkreacionz
 * @since Nov 26, 2015
 */
class CeilingFanMedCommand  implements Command {

    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMedCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.med();
    }

    @Override
    public void undo() {
        System.out.println("prevSpeed :: "+prevSpeed);
        switch (prevSpeed) {
            case CeilingFan.HIGH: this.ceilingFan.high();break;
            case CeilingFan.MED: this.ceilingFan.med();break;
            case CeilingFan.LOW: this.ceilingFan.low();break;
            case CeilingFan.OFF: 
                default: this.ceilingFan.off();break;
        }
        prevSpeed = ceilingFan.getSpeed();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- CeilingFan Med Command -----------");
        s.append("ceiling fan name:").append(ceilingFan.getName());
        return s.toString();
    }

}

