/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv1;

/**
 *
 * @author moronkreacionz
 * @since Nov 24, 2015
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- Light Off Command -----------");
        s.append("light name:").append(light.getName());
        return s.toString();
    }

}
