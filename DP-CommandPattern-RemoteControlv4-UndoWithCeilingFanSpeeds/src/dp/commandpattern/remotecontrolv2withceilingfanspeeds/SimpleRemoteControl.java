/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv2withceilingfanspeeds;

/**
 *
 * @author moronkreacionz
 * @since Nov 24, 2015
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {
        System.out.println("SimpleRemoteContorl Created");
    }

    /**
     *
     * @param command
     */
    public void setCommand(Command command) {
        slot = command;
        System.out.println("Command " + slot +" is configured");
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
