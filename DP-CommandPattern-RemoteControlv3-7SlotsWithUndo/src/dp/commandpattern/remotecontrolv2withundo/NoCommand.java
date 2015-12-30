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
class NoCommand implements Command {

    public NoCommand() { }

    @Override
    public void execute() {
        System.out.println("no command executed");
    }
    
    @Override
    public void undo(){
        System.out.println("no undo action");
    }
    
    @Override
    public String toString() {
        return "no command";
    }
}
