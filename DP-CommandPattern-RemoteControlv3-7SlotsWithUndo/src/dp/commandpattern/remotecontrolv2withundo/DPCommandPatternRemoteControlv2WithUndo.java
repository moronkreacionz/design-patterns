/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.remotecontrolv2withundo;

/**
 *
 * @author moronkreacionz
 */
public class DPCommandPatternRemoteControlv2WithUndo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RemoteControl rc = new RemoteControl("E1120-Rock-Remote");

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Room");
        CeilingFan livingRoomCeilingFan = new CeilingFan("LivingRoom CeilingFan");
        GarageDoor mainGarageDoor = new GarageDoor("Main Garage Door");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand livingRoomCeilingFanOnCommand = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand livingRoomCeilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(mainGarageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(mainGarageDoor);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        //allLightsOnCommand allLightsOffCommand
        //partyModeOnCommand partyModeOffCommand 
        int slot = 0;

        // 0, livingRoomLight 
        rc.setCommand(slot, livingRoomLightOnCommand, livingRoomLightOffCommand);
        System.out.println("-- Setting Living Room Light On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Living Room Light Off >> ");
        rc.offCommandPressed(slot);

        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");
        System.out.println("Remote Control Info:"+rc);
        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");
        
        rc.undoCommandPressed();
        rc.undoCommandPressed();
        // running undo again does the same operation, 
        // however this should be operated as a stack of control+z commands 
        
        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");
        System.out.println("Remote Control Info:"+rc);
        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");
        
        
        
        slot++;
        // 1, kitchenLight 
        rc.setCommand(slot, kitchenLightOnCommand, kitchenLightOffCommand);
        System.out.println("-- Setting Kitchen Room Light On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Kitchen Room Light Off >> ");
        rc.offCommandPressed(slot);

        slot++;
        // 2, livingRoomCeilingFan
        rc.setCommand(slot, livingRoomCeilingFanOnCommand, livingRoomCeilingFanOffCommand);
        System.out.println("-- Setting Living Room Ceiling Fan On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Living Room Ceiling Fan Off >> ");
        rc.offCommandPressed(slot);

        slot++;
        // 3, garageDoor
        rc.setCommand(slot, garageDoorOpenCommand, garageDoorCloseCommand);
        System.out.println("-- Setting Main Room Garage Open >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Main Room Garage Close >> ");
        rc.offCommandPressed(slot);

        slot++;
        // 4, stereo
        rc.setCommand(slot, stereoOnCommand, stereoOffCommand);
        System.out.println("-- Setting Stereo On >> ");
        rc.onCommandPressed(slot);

        System.out.println("-- Setting Stereo Off >> ");
        rc.offCommandPressed(slot);

        // 5, allLights
        // rc.setCommand(slot, allLightsOnCommand, allLightsOffCommand);
        // 6, partyMode
        // rc.setCommand(slot, partyModeOnCommand, partyModeOffCommand);
        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");
        System.out.println("Remote Control Info:"+rc);
        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");
        
        
        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");
        System.out.println("\n\n\n--------------------------------\n\n--------------------------------");

        SimpleRemoteControl rc1 = new SimpleRemoteControl();
        System.out.println("--");
        Light livingRoomLight1 = new Light("LivingRoomLight");
        System.out.println("--");

        LightOnCommand livingRoomOnCommand1 = new LightOnCommand(livingRoomLight1);
        System.out.println("-- Setting Light On >> ");
        rc1.setCommand(livingRoomOnCommand1);
        rc1.buttonWasPressed();

        System.out.println("-- Setting Light Off >> ");
        LightOffCommand livingRoomOffCommand1 = new LightOffCommand(livingRoomLight1);
        rc1.setCommand(livingRoomOffCommand1);
        rc1.buttonWasPressed();

        System.out.println("--");
        GarageDoor mainGarageDoor1 = new GarageDoor("Main Garage Door");
        System.out.println("--");
        System.out.println("-- Setting GarageDoor Open >> ");
        GarageDoorOpenCommand garageDoorOpenCommand1 = new GarageDoorOpenCommand(mainGarageDoor1);
        rc1.setCommand(garageDoorOpenCommand1);
        rc1.buttonWasPressed();

        System.out.println("-- Setting GarageDoor Close >> ");
        GarageDoorCloseCommand garageDoorCloseCommand1 = new GarageDoorCloseCommand(mainGarageDoor1);
        rc1.setCommand(garageDoorCloseCommand1);
        rc1.buttonWasPressed();

    }

}
