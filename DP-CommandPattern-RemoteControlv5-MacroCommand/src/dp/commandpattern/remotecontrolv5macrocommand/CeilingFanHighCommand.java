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
class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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
        s.append("---------- CeilingFan High Command -----------");
        s.append("ceiling fan name:").append(ceilingFan.getName());
        return s.toString();
    }

}
