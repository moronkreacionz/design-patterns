/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv5macrocommand;

/**
 *
 * @author moronkreacionz
 * @since Nov 24, 2015
 */
public class StereoOnCommand implements Command {

    private Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCDName("MegaHits");
        stereo.setVolume(11);
    }
    @Override
    public void undo() {
        stereo.off();
        stereo.setCDName("");
        stereo.setVolume(0);
    } 
   
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- Stereo On Command, with CD and Volume -----------");
        s.append("Stereo name:").append(stereo.getName());
        return s.toString();
    }

}
