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
public class DPCommandPatternRemoteControlv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

            SimpleRemoteControl rc = new SimpleRemoteControl();
            System.out.println("--");
            Light livingRoomLight = new Light("LivingRoomLight");
            System.out.println("--");
            
            
            LightOnCommand livingRoomOnCommand = new LightOnCommand(livingRoomLight);
            System.out.println("--");
            System.out.println(" Setting Light On >> ");
            rc.setCommand(livingRoomOnCommand);
            rc.buttonWasPressed();
            
            System.out.println("--");
            System.out.println(" Setting Light Off >> ");
            LightOffCommand livingRoomOffCommand = new LightOffCommand(livingRoomLight);
            rc.setCommand(livingRoomOffCommand);
            rc.buttonWasPressed();
            
            System.out.println("--");
            GarageDoor mainGarageDoor = new GarageDoor("Main Garage Door");
            System.out.println("--");
            System.out.println("--");
            System.out.println(" Setting GarageDoor Open >> ");
            GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(mainGarageDoor);
            rc.setCommand( garageDoorOpenCommand );
            rc.buttonWasPressed();
            
            System.out.println("--");
            System.out.println(" Setting GarageDoor Close >> ");
            GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(mainGarageDoor);
            rc.setCommand( garageDoorCloseCommand );
            rc.buttonWasPressed();
            
    }
    
}
