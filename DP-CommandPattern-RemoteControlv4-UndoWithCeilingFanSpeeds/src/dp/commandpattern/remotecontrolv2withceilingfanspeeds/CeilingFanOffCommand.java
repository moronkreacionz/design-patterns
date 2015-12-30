/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv2withceilingfanspeeds;

/**
 *
 * @author moronkreacionz
 * @since Nov 25, 2015
 */
class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        System.out.println("undo in Fan Off Command :: prevSpeed :: "+prevSpeed);
        switch (prevSpeed) {
            case CeilingFan.HIGH: this.ceilingFan.med();break;
            case CeilingFan.MED: this.ceilingFan.low();break;
            case CeilingFan.LOW: this.ceilingFan.off();break;
            case CeilingFan.OFF: 
                default: break;
        }
        prevSpeed = ceilingFan.getSpeed();
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- CeilingFan Off Command -----------");
        s.append("ceiling fan name:").append(ceilingFan.getName());
        return s.toString();
    }

}
