/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp.commandpattern.remotecontrolv2;

/**
 *
 * @author moronkreacionz
 * @since Nov 25, 2015
 */
class NoCommand implements Command {

    public NoCommand() { }

    public void execute() {
        System.out.println("no command executed");
    }

    public String toString() {
        return "no command";
    }
}
