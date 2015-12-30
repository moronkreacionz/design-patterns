/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv1;

/**
 *
 * @author moronkreacionz
 */
interface Command {
    public void execute();
    @Override
    public String toString();
}
