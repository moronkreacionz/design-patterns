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
class HotTubOffCommand implements Command {

    private HotTub hottub;

    public HotTubOffCommand(HotTub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        this.hottub.off();
    }
    @Override
    public void undo() {
        this.hottub.on();
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- HotTub Off Command -----------");
        s.append("HotTub name:").append(hottub.getName());
        return s.toString();
    }

}
