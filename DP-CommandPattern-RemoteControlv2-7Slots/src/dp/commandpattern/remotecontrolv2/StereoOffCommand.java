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
class StereoOffCommand implements Command {

    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
        stereo.setCDName("");
        stereo.setVolume(0);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- Stereo Off Command, with reseting CD and reseting Volume -----------");
        s.append("Stereo name:").append(stereo.getName());
        return s.toString();
    }

}