/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv2;

/**
 *
 * @author moronkreacionz
 * @since Nov 24, 2015
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("---------- Light On Command -----------");
        s.append("light name:").append(light.getName());
        return s.toString();
    }

}
