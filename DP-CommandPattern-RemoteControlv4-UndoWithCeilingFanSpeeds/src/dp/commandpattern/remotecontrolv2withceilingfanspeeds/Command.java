/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv2withceilingfanspeeds;

/**
 *
 * @author moronkreacionz
 */
interface Command {
    public void execute();
    public void undo();
    @Override
    public String toString();
}
