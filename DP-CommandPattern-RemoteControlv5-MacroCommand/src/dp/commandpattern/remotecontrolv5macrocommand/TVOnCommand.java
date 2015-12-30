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
class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
    }
    @Override
    public void undo() {
        this.tv.off();
    }
    
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- TV On Command -----------");
        s.append("TV name:").append(tv.getName());
        return s.toString();
    }
}