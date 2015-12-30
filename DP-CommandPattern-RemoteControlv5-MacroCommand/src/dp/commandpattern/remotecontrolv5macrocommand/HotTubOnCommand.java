/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.commandpattern.remotecontrolv5macrocommand;

/**
 *
 * @author moronkreacionz
 * @since Nov 26, 2015
 */
class HotTubOnCommand  implements Command {

    private HotTub hottub;

    public HotTubOnCommand(HotTub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.on();
    }
    @Override
    public void undo() {
        this.hottub.off();
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- HotTub On Command -----------");
        s.append("HotTub name:").append(hottub.getName());
        return s.toString();
    }

}
